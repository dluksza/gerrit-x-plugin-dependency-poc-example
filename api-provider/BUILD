load("//tools/bzl:plugin.bzl", "gerrit_plugin")

gerrit_plugin(
    name = "api-provider",
    srcs = glob(["src/main/java/**/*.java"]),
    manifest_entries = [
        "Gerrit-PluginName: api-provider",
        "Gerrit-ApiModule: org.luksza.gerrit.ApiProviderModule",
    ],
)


