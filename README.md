# dubbotest
用Idea创建一个maven项目,利用zookeeper测试dubbo框架

用Idea引入项目时,选择import project,点击dubbotest文件夹下的pom文件,即可导入程序,程序中如果HelloServiceImpl中@Override标红,没有关系,程序照样能够运行.

启动时,先启动zookeeper(zookeeper没有进行除copy zoo_sample.cfg以外的任何操作),然后在produce包中,
启动test包下的主程序ProduceTest,此时生产者会向zookeeper发送自己实现的service信息,如果zookeeper中没有输出,按下任意键观察是否有日志信息输出,如果zookeeper确定已经建立连接,此时ProduceTest程序中会有文字"Dubbo provider start...",这句话意味着生产者启动成功.

生产者启动完成后,启动消费者(ConsumerTest),启动后,观察ProduceTest程序,如果出现"啊哈哈哈"的字样,就代表DUBBO成功.
如果希望在ConsumerTest中输出字段的话,在produce包中的HelloServiceImpl中将方法的返回值由void改为你希望得到的数据,然后在ConsumerTest中获得这一返回值并输出即可.

建议从ConsumerTest开始入手,读程序,读的顺序按照ConsumerTest->springmvc.xml->consumer.xml->api包中的HelloService.
ProduceTest中按照 主程序->springmvc.xml->produce.xml->api包中的HelloService->HelloServiceImpl.

dubbo_api包的作用可以看作是接口文档,如果说在生产者中包含了该Service接口的声明,消费者和生产者间的耦合程度增大(消费者依赖于生产者),不利于程序开发.