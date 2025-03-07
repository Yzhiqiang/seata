Add changes here for all PR submitted to the develop branch.


<!-- Please add the `changes` to the following location(feature/bugfix/optimize/test) based on the type of PR -->

### feature：
  - [[#4676](https://github.com/seata/seata/pull/4676)] support server to expose Nacos services by mounting SLB

### bugfix：
  - [[#4515](https://github.com/seata/seata/pull/4515)] fix the error of SeataTCCFenceAutoConfiguration when database unused
  - [[#4661](https://github.com/seata/seata/pull/4661)] fix sql exception with PostgreSQL in module console
  - [[#4667](https://github.com/seata/seata/pull/4682)] fix the exception in RedisTransactionStoreManager for update map During iteration
  - [[#4678](https://github.com/seata/seata/pull/4678)] fix the error of key transport.enableRmClientBatchSendRequest cache penetration if not configure
  - [[#4701](https://github.com/seata/seata/pull/4701)] fix missing command line args
  - [[#4607](https://github.com/seata/seata/pull/4607)] fix bug on skipping lock check


### optimize：
  - [[#4650](https://github.com/seata/seata/pull/4650)] fix some security vulnerabilities
  - [[#4670](https://github.com/seata/seata/pull/4670)] optimize the thread pool size of branchResultMessageExecutor
  - [[#4662](https://github.com/seata/seata/pull/4662)] optimize rollback transaction metrics
  - [[#4693](https://github.com/seata/seata/pull/4693)] optimize the console navigation bar
  - [[#4544](https://github.com/seata/seata/pull/4544)] optimize jackson dependencies in TransactionContextFilterTest
  - [[#4700](https://github.com/seata/seata/pull/4700)] fix maven-compiler-plugin and maven-resources-plugin execute failed
  - [[#4720](https://github.com/seata/seata/pull/4720)] optimize pom description

### test:

Thanks to these contributors for their code commits. Please report an unintended omission.

<!-- Please make sure your Github ID is in the list below -->
- [slievrly](https://github.com/slievrly)
- [pengten](https://github.com/pengten)
- [YSF-A](https://github.com/YSF-A)
- [tuwenlin](https://github.com/tuwenlin)
- [Ifdevil](https://github.com/Ifdevil)
- [wingchi-leung](https://github.com/wingchi-leung)
- [liurong](https://github.com/robynron)
- [2129zxl](https://github.com/2129zxl)

Also, we receive many valuable issues, questions and advices from our community. Thanks for you all.
