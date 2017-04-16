FROM centos:7
MAINTAINER "qilab"

ADD . /qilab
RUN curl -L http://www.opscode.com/chef/install.sh | bash$
RUN /opt/chef/embedded/bin/gem install knife-solo --no-ri --no-rdoc$
WORKDIR /qilab
