# importNew
importNew网站学习代码


概况起来，在设计分布式系统时，应考虑以下几个问题：

系统如何拆分为子系统？
如何规划子系统间的通信？
通信过程中的安全如何考虑？
如何让子系统可以扩展？
子系统的可靠性如何保证？
数据的一致性是如何实现的？
实际上，上面的每一个问题都不是简单的问题。还好，我们要感谢开源，让这个时代的技术可以共享，让实现复杂系统的成本越来越低。比如，

1.我们在设计通信时，我们可以采用面向消息的中间件，比如Apache ActiveMQ、RabbitMQ、Apache RocketMQ、Apache Kafka等，也有类似与 Google Protocol Buffer、Thrift等 RPC框架。
2.在设计分布式计算时，我们分布式计算可以采用 MapReduce、Apache Hadoop、Apache Spark 等。
3.在大数据和分布式存储方面，我们可以选择 Apache HBase、Apache Cassandra、Memcached、Redis、MongoDB等。
4.在分布式监控方面，常用的技术包括Nagios、Zabbix、Consul、ZooKeeper等。