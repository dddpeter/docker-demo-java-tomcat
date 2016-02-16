FROM daocloud.io/dddpeter/centos6-tomcat8-jdk8-mvn3:v0.3
ADD pom.xml /tmp/build/
RUN source /root/.bash_profile && cd /tmp/build && mvn -q dependency:resolve

ADD src /tmp/build/src
        #构建应用
RUN source /root/.bash_profile && cd /tmp/build && mvn -q -DskipTests=true package \
        #拷贝编译结果到指定目录
	&& rm -rf $CATALINA_HOME/webapps/* \
        && mv target/*.war $CATALINA_HOME/webapps/ROOT.war \
        #清理编译痕迹
        && cd / && rm -rf /tmp/build



