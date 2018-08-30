FROM centos:centos7
LABEL MAINTAINER Virtualan

ENV JAVA_HOME /usr/java/jre1.8.0_77

RUN yum -y update && yum install -y initscripts sudo passwd sed screen byobu which vim-enhanced tar wget unzip

#Warning - Oracle Licensing model needs to be discussed for below usage
#Download & Installing JRE 8
RUN wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u77-b03/jre-8u77-linux-x64.rpm"
RUN yum -y localinstall jre-8u77-linux-x64.rpm

ADD maven/${project.build.finalName}.jar /openapi/virtualan/${project.build.finalName}.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/${project.build.finalName}.jar"] 
