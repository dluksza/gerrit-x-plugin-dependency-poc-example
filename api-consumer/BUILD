load("//tools/bzl:plugin.bzl", "gerrit_plugin")

gerrit_plugin(
    name = "api-consumer",
    srcs = glob(["src/main/java/**/*.java"]),
    manifest_entries = [
        "Gerrit-PluginName: api-consumer",
        "Gerrit-Module: org.luksza.gerrit.ConsumerModule",
    ],
    deps = [":api-provider-neverlink"]
)

java_library(
    name = "api-provider-neverlink",
    neverlink = 1,
    exports = ["//plugins/api-provider:api-provider.api"],
)
