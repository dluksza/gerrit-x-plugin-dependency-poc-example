## Installation

```bash
$ cd $(gerrit)/plugins
$ ln -s ../../api-provider .
$ ln -s ../../api-consumer .
$ cd $(gerrit)
$ bazel build plugins/api-provider:api-provider.api
$ bazel build plugins/api-consumer
$ cp bazel-bin/plugins/api-provider/api-provider.api.jar $(gerrit_testsite)/lib
$ cp bazel-bin/plugins/api-consumer/api-consumer.jar $(gerrit_testsite)/plugins
$ $(gerrit_testsite)/bin/gerrit.sh run
```
