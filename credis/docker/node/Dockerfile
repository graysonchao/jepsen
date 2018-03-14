FROM graysonchao/credis:latest

RUN rm /etc/apt/apt.conf.d/docker-clean && apt-get update && apt-get install -y bzip2 curl faketime iproute iptables iputils-ping logrotate man man-db net-tools ntpdate psmisc python rsyslog sudo pwgen openssh-server
ADD ./setup_ssh.sh /setup_ssh.sh
RUN mkdir -p /var/run/sshd && \
    sed -i "s/UsePrivilegeSeparation.*/UsePrivilegeSeparation no/g" /etc/ssh/sshd_config && \
    sed -i "s/PermitRootLogin without-password/PermitRootLogin yes/g" /etc/ssh/sshd_config
RUN chmod +x /setup_ssh.sh

EXPOSE 22

CMD /bin/bash

