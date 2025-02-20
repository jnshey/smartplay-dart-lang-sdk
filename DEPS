# Copyright (c) 2012, the Dart project authors.  Please see the AUTHORS file
# for details. All rights reserved. Use of this source code is governed by a
# BSD-style license that can be found in the LICENSE file.

# IMPORTANT:
# Before adding or updating dependencies, please review the documentation here:
# https://github.com/dart-lang/sdk/tree/main/docs/Adding-and-Updating-Dependencies.md
#
# Packages can be rolled to the latest version with `tools/manage_deps.dart`.
#
# For example:
#
#     dart tools/manage_deps.dart bump third_party/pkg/dart_style

allowed_hosts = [
  'android.googlesource.com',
  'boringssl.googlesource.com',
  'chrome-infra-packages.appspot.com',
  'chromium.googlesource.com',
  'dart.googlesource.com',
  'dart-internal.googlesource.com',
  'fuchsia.googlesource.com',
  'llvm.googlesource.com',
]

vars = {
  # The dart_root is the root of our sdk checkout. This is normally
  # simply sdk, but if using special gclient specs it can be different.
  "dart_root": "sdk",

  # We use mirrors of all github repos to guarantee reproducibility and
  # consistency between what users see and what the bots see.
  # We need the mirrors to not have 100+ bots pulling github constantly.
  # We mirror our github repos on Dart's git servers.
  # DO NOT use this var if you don't see a mirror here:
  #   https://dart.googlesource.com/
  "dart_git": "https://dart.googlesource.com/",
  "dart_internal_git": "https://dart-internal.googlesource.com",
  # If the repo you want to use is at github.com/dart-lang, but not at
  # dart.googlesource.com, please file an issue
  # on github and add the label 'area-infrastructure'.
  # When the repo is mirrored, you can add it to this DEPS file.

  # Chromium git
  "android_git": "https://android.googlesource.com",
  "chromium_git": "https://chromium.googlesource.com",
  "fuchsia_git": "https://fuchsia.googlesource.com",
  "llvm_git": "https://llvm.googlesource.com",

  # Checked-in SDK version. The checked-in SDK is a Dart SDK distribution
  # in a cipd package used to run Dart scripts in the build and test
  # infrastructure, which is automatically built on the release commits.
  "sdk_tag": "git_revision:7fce3544047c41018b8c00b4453c0262f463dd74",

  # co19 is a cipd package automatically generated for each co19 commit.
  # Use tests/co19/update.sh to update this hash.
  "co19_rev": "886cdf17954f843fb01a6058fbcc8a561c688059",

  # The internal benchmarks to use. See go/dart-benchmarks-internal
  "benchmarks_internal_rev": "3bd6bc6d207dfb7cf687537e819863cf9a8f2470",
  "checkout_benchmarks_internal": False,

  # Checkout the flute benchmark only when benchmarking.
  "checkout_flute": False,

  # Checkout Android dependencies only on Mac and Linux.
  "download_android_deps":
    "host_os == mac or (host_os == linux and host_cpu == x64)",

  # Checkout extra javascript engines for testing or benchmarking. You can
  # self-service update these by following the go/dart-engprod/browsers.md
  # instructions. d8, the V8 shell, is always checked out.
  "checkout_javascript_engines": False,
  "d8_tag": "version:13.3.33",
  "jsshell_tag": "version:132.0.2",
  "jsc_tag": "version:286531",

  # https://chrome-infra-packages.appspot.com/p/fuchsia/third_party/clang
  "clang_version": "git_revision:388d7f144880dcd85ff31f06793304405a9f44b6",

  # https://chrome-infra-packages.appspot.com/p/gn/gn
  "gn_version": "git_revision:feafd1012a32c05ec6095f69ddc3850afb621f3a",

  "reclient_version": "git_revision:c7349324c93c6e0d85bc1e00b5d7526771006ea0",
  "download_reclient": True,

  # Update from https://chrome-infra-packages.appspot.com/p/fuchsia/sdk/core
  "fuchsia_sdk_version": "version:25.20241104.6.1",
  "download_fuchsia_deps": False,

  # Ninja, runs the build based on files generated by GN.
  "ninja_tag": "version:2@1.11.1.chromium.7",

  # Scripts that make 'git cl format' work.
  "clang_format_scripts_rev": "bb994c6f067340c1135eb43eed84f4b33cfa7397",

  ### /third_party/ dependencies

  # Prefer to use hashes of binaryen that have been reviewed & rolled into g3.
  "binaryen_rev" : "93883fde36ac158fd415dcd6dbd387dcfd928d3c",
  "boringssl_gen_rev": "fef055e8d2749b82c79c8f043be1cbe5e8e4b40c",
  "boringssl_rev": "2db0eb3f96a5756298dcd7f9319e56a98585bd10",
  "browser-compat-data_tag": "ac8cae697014da1ff7124fba33b0b4245cc6cd1b", # v1.0.22
  "cpu_features_rev": "936b9ab5515dead115606559502e3864958f7f6e",
  "devtools_rev": "3642846c465888b0c56271fe9265a0901f1803f6",
  "icu_rev": "43953f57b037778a1b8005564afabe214834f7bd",
  "jinja2_rev": "2222b31554f03e62600cd7e383376a7c187967a1",
  "libcxx_rev": "44079a4cc04cdeffb9cfe8067bfb3c276fb2bab0",
  "libcxxabi_rev": "2ce528fb5e0f92e57c97ec3ff53b75359d33af12",
  "libprotobuf_rev": "24487dd1045c7f3d64a21f38a3f0c06cc4cf2edb",
  "markupsafe_rev": "8f45f5cfa0009d2a70589bcda0349b8cb2b72783",
  "perfetto_rev": "13ce0c9e13b0940d2476cd0cff2301708a9a2e2b",
  "ply_rev": "604b32590ffad5cbb82e4afef1d305512d06ae93",
  "protobuf_gn_rev": "ca669f79945418f6229e4fef89b666b2a88cbb10",
  "WebCore_rev": "bcb10901266c884e7b3740abc597ab95373ab55c",
  "zlib_rev": "108fa50cda23ed4a712a098d058dccbbfd248206",

  ### /third_party/pkg dependencies
  # 'tools/rev_sdk_deps.dart' can rev pkg dependencies to their latest; put an
  # EOL comment after a dependency to disable this and pin it at its current
  # revision.

  "core_rev": "1de837279d3c4ce21fef2a5af8a7f0b668ef3d85",
  # Note: Updates to dart_style have to be coordinated with the infrastructure
  # team so that the internal formatter `tools/sdks/dart-sdk/bin/dart format`
  # matches the version here. Please follow this process to make updates:
  #
  # * Create a commit that updates the version here to the desired version and
  #   adds any appropriate CHANGELOG text.
  # * Send that to eng-prod to review. They will update the checked-in SDK
  #   and land the review.
  #
  # For more details, see https://github.com/dart-lang/sdk/issues/30164.
  "dart_style_rev": "f6d020e48cc531a0967c91fa88028c086fedfbf9", # disable tools/rev_sdk_deps.dart
  "dartdoc_rev": "c7f11603effa88ddacabfd555993f322fca8b3fe",
  "ecosystem_rev": "52e4ceb6f0715bab5c47495429c4a2b7ce708a66",
  "flute_rev": "a531c96a8b43d015c6bfbbfe3ab54867b0763b8b",
  "glob_rev": "b6319d6c2880b44039e75dfed80f7ce150f76d51",
  "http_rev": "79470d014b467f01b0e7c5b63ab6c86b22dec8db",
  "http_multi_server_rev": "c8aabe36268aa38c906eae46728c10d883b9aced",
  "intl_rev": "5d65e3808ce40e6282e40881492607df4e35669f",
  "leak_tracker_rev": "f5620600a5ce1c44f65ddaa02001e200b096e14c", # manually rolled
  "lints_rev": "f72e5ce9b4bc6550ecb3437cb50c8a0c9f00fe18",
  "markdown_rev": "776689c8749ebddd4ea0ec899085bd2aae0e25ba",
  "material_color_utilities_rev": "799b6ba2f3f1c28c67cc7e0b4f18e0c7d7f3c03e",
  # dart-native-interop-team@ is rolling breaking changes manually while the assets features are in experimental.
  "native_rev": "51647776372aa9e1f839efb811aa959fe445c0cf", # disable tools/rev_sdk_deps.dart
  "package_config_rev": "2583a4e2f9382409ba3bcfa4887ef2a2a8a2aee3",
  "pool_rev": "0bac9b20ef61ad8bfdd6b92b565dd12e8e2e2c78",
  "protobuf_rev": "ccf104dbc36929c0f8708285d5f3a8fae206343e",
  "pub_rev": "8c2e621c2403cb503cc9959be387d1061a16846a", # disable tools/rev_sdk_deps.dart
  "pub_semver_rev": "ab3eab50cc9f3df650ba7f5571aa2a1ea715dcc8",
  "shelf_rev": "a2708cd8bce88d5e6391b1cb5bbe80b5a072c55a",
  "source_maps_rev": "b20b97003a48d78a1ecba7e46d932ea4b480dd94",
  "source_span_rev": "f147469ba02108c1ade3680de548b7b447de8c72",
  "sse_rev": "befbd6d35118f59525903242db3888942ac34180",
  "stack_trace_rev": "63e79f584567f7c73e7f5739c7cfd8e748f51f16",
  "stream_channel_rev": "9bfc2a8dec202bcd07332f39df0f905c670092c6",
  "string_scanner_rev": "255d67111e3ed67caedba2789269b6344bf62638",
  "sync_http_rev": "82362bcf252e4772036b1178887b471de9c5ccb1",
  "tar_rev": "5a1ea943e70cdf3fa5e1102cdbb9418bd9b4b81a",
  "term_glyph_rev": "31abb04b735395ba98db3dd4a360b85729dfddfa",
  "test_rev": "8a07bee398833ca38ca4c88905ccdbd513f40705",
  "test_descriptor_rev": "71195671e00f2d330a9ebda0bd48f99364bb30f2",
  "test_process_rev": "7c76f470173366ec90525e49961f2ce1fcf516d3",
  "test_reflective_loader_rev": "30a552df6421e1f68cdc33c98c2512984b6f42b9",
  "tools_rev": "a6603a45374fc2ed9de4cf0297bde003f141dc9b",
  "vector_math_rev": "ec5080d5e6731bef4deffae78eb778ae787ba92f",
  "watcher_rev": "7a15a903f7ce0737cce7d08ff30402d41b9f7b62",
  "web_rev": "8d243766b45c163a9d18a89de059eba24398d163",
  "web_socket_channel_rev": "abe77eabb6566a2d5129d1178ef2e342ca578e64",
  "webdev_rev": "5f30c560dc4e3df341356c43ec1a766ee6b74a7c",
  "webdriver_rev": "4998763b2b748f9daaf1f58c5004c040a630ccf7",
  "webkit_inspection_protocol_rev": "a834c3b700ead5f1157740d6585ab374f8af1507",
  "yaml_rev": "402655e84389bd1a4208000d75c16d1e5faeb443",
  "yaml_edit_rev": "8bd0fdfbe1e5119367500543d68be10691efce58",

  # Windows deps
  "crashpad_rev": "d256de317164c0eb362bdd9cbb4d259fe6d086f3",
  "minichromium_rev": "203a01130fac64bfdcc8cab2e1798c7b2c0619bf",
  "googletest_rev": "f854f1d27488996dc8a6db3c9453f80b02585e12",

  # Pinned browser versions used by the testing infrastructure. These are not
  # meant to be downloaded by users for local testing. You can self-service
  # update these by following the go/dart-engprod/browsers.md instructions.
  "download_chrome": False,
  "chrome_tag": "132.0.6834.6",
  "download_firefox": False,
  "firefox_tag": "132.0",

  # Emscripten is used in dart2wasm tests.
  "download_emscripten": False,
  "emsdk_rev": "e41b8c68a248da5f18ebd03bd0420953945d52ff",
  "emsdk_ver": "3.1.3",
}

gclient_gn_args_file = Var("dart_root") + '/build/config/gclient_args.gni'
gclient_gn_args = [
]

deps = {
  # Stuff needed for GN build.
  Var("dart_root") + "/buildtools/clang_format/script":
    Var("chromium_git") + "/chromium/llvm-project/cfe/tools/clang-format.git" +
    "@" + Var("clang_format_scripts_rev"),

  Var("dart_root") + "/benchmarks-internal": {
    "url": Var("dart_internal_git") + "/benchmarks-internal.git" +
           "@" + Var("benchmarks_internal_rev"),
    "condition": "checkout_benchmarks_internal",
  },
  Var("dart_root") + "/tools/sdks/dart-sdk": {
      "packages": [{
          "package": "dart/dart-sdk/${{platform}}",
          "version": Var("sdk_tag"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/d8/linux/x64": {
      "packages": [{
          "package": "dart/third_party/d8/linux-amd64",
          "version": Var("d8_tag"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/d8/linux/arm64": {
      "packages": [{
          "package": "dart/third_party/d8/linux-arm64",
          "version": Var("d8_tag"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/d8/macos/x64": {
      "packages": [{
          "package": "dart/third_party/d8/mac-amd64",
          "version": Var("d8_tag"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/d8/macos/arm64": {
      "packages": [{
          "package": "dart/third_party/d8/mac-arm64",
          "version": Var("d8_tag"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/d8/windows/x64": {
      "packages": [{
          "package": "dart/third_party/d8/windows-amd64",
          "version": Var("d8_tag"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/firefox_jsshell": {
      "packages": [{
          "package": "dart/third_party/jsshell/${{platform}}",
          "version": Var("jsshell_tag"),
      }],
      "condition": "checkout_javascript_engines",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/jsc": {
      "packages": [{
          "package": "dart/third_party/jsc/${{platform}}",
          "version": Var("jsc_tag"),
      }],
      "condition": "checkout_javascript_engines and host_os == 'linux' and host_cpu == 'x64'",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/devtools": {
      "packages": [{
          "package": "dart/third_party/flutter/devtools",
          "version": "git_revision:" + Var("devtools_rev"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/tests/co19/src": {
      "packages": [{
          "package": "dart/third_party/co19",
          "version": "git_revision:" + Var("co19_rev"),
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/markupsafe":
      Var("chromium_git") + "/chromium/src/third_party/markupsafe.git" +
      "@" + Var("markupsafe_rev"),
  Var("dart_root") + "/third_party/babel": {
      "packages": [{
          "package": "dart/third_party/babel",
          "version": "version:7.4.5",
      }],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/zlib":
      Var("chromium_git") + "/chromium/src/third_party/zlib.git" +
      "@" + Var("zlib_rev"),
  Var("dart_root") + "/third_party/cpu_features/src":
      Var("chromium_git") + "/external/github.com/google/cpu_features.git" +
      "@" + Var("cpu_features_rev"),

  Var("dart_root") + "/third_party/libcxx":
      Var("llvm_git") + "/llvm-project/libcxx" + "@" + Var("libcxx_rev"),

  Var("dart_root") + "/third_party/libcxxabi":
      Var("llvm_git") + "/llvm-project/libcxxabi" + "@" + Var("libcxxabi_rev"),

  Var("dart_root") + "/third_party/boringssl":
      Var("dart_git") + "boringssl_gen.git" + "@" + Var("boringssl_gen_rev"),
  Var("dart_root") + "/third_party/boringssl/src":
      "https://boringssl.googlesource.com/boringssl.git" +
      "@" + Var("boringssl_rev"),

  Var("dart_root") + "/third_party/binaryen/src" :
      Var("chromium_git") + "/external/github.com/WebAssembly/binaryen.git" +
      "@" + Var("binaryen_rev"),

  Var("dart_root") + "/third_party/gsutil": {
      "packages": [{
          "package": "infra/3pp/tools/gsutil",
          "version": "version:3@5.30",
      }],
      "dep_type": "cipd",
  },

  Var("dart_root") + "/third_party/emsdk":
      Var("dart_git") + "external/github.com/emscripten-core/emsdk.git" +
      "@" + Var("emsdk_rev"),

  Var("dart_root") + "/third_party/jinja2":
      Var("chromium_git") + "/chromium/src/third_party/jinja2.git" +
      "@" + Var("jinja2_rev"),

  Var("dart_root") + "/third_party/perfetto":
      Var("android_git") + "/platform/external/perfetto" +
      "@" + Var("perfetto_rev"),

  Var("dart_root") + "/third_party/ply":
      Var("chromium_git") + "/chromium/src/third_party/ply.git" +
      "@" + Var("ply_rev"),

  Var("dart_root") + "/build/secondary/third_party/protobuf":
      Var("fuchsia_git") + "/protobuf-gn" +
      "@" + Var("protobuf_gn_rev"),

  Var("dart_root") + "/third_party/protobuf":
      Var("fuchsia_git") + "/third_party/protobuf" +
      "@" + Var("libprotobuf_rev"),

  Var("dart_root") + "/third_party/icu":
      Var("chromium_git") + "/chromium/deps/icu.git" +
      "@" + Var("icu_rev"),

  Var("dart_root") + "/third_party/WebCore":
      Var("dart_git") + "webcore.git" + "@" + Var("WebCore_rev"),

  Var("dart_root") + "/third_party/mdn/browser-compat-data/src":
      Var('chromium_git') + '/external/github.com/mdn/browser-compat-data' +
      "@" + Var("browser-compat-data_tag"),

  Var("dart_root") + "/third_party/pkg/core":
      Var("dart_git") + "core.git" + "@" + Var("core_rev"),
  Var("dart_root") + "/third_party/pkg/dart_style":
      Var("dart_git") + "dart_style.git" + "@" + Var("dart_style_rev"),
  Var("dart_root") + "/third_party/pkg/dartdoc":
      Var("dart_git") + "dartdoc.git" + "@" + Var("dartdoc_rev"),
  Var("dart_root") + "/third_party/pkg/ecosystem":
      Var("dart_git") + "ecosystem.git" + "@" + Var("ecosystem_rev"),
  Var("dart_root") + "/third_party/flute": {
    "url": Var("dart_git") + "flute.git" + "@" + Var("flute_rev"),
    "condition": "checkout_flute",
  },
  Var("dart_root") + "/third_party/pkg/glob":
      Var("dart_git") + "glob.git" + "@" + Var("glob_rev"),

  Var("dart_root") + "/third_party/pkg/http":
      Var("dart_git") + "http.git" + "@" + Var("http_rev"),
  Var("dart_root") + "/third_party/pkg/http_multi_server":
      Var("dart_git") + "http_multi_server.git" +
      "@" + Var("http_multi_server_rev"),
  Var("dart_root") + "/third_party/pkg/intl":
      Var("dart_git") + "intl.git" + "@" + Var("intl_rev"),
  Var("dart_root") + "/third_party/pkg/leak_tracker":
      Var("dart_git") + "leak_tracker.git" + "@" + Var("leak_tracker_rev"),
  Var("dart_root") + "/third_party/pkg/lints":
      Var("dart_git") + "lints.git" + "@" + Var("lints_rev"),
  Var("dart_root") + "/third_party/pkg/markdown":
      Var("dart_git") + "markdown.git" + "@" + Var("markdown_rev"),
  Var("dart_root") + "/third_party/pkg/material_color_utilities": {
    "url": Var("dart_git") +
           "external/github.com/material-foundation/material-color-utilities.git" +
           "@" + Var("material_color_utilities_rev"),
    "condition": "checkout_flute",
  },
  Var("dart_root") + "/third_party/pkg/native":
      Var("dart_git") + "native.git" + "@" + Var("native_rev"),
  Var("dart_root") + "/third_party/pkg/package_config":
      Var("dart_git") + "package_config.git" +
      "@" + Var("package_config_rev"),
  Var("dart_root") + "/third_party/pkg/pool":
      Var("dart_git") + "pool.git" + "@" + Var("pool_rev"),
  Var("dart_root") + "/third_party/pkg/protobuf":
       Var("dart_git") + "protobuf.git" + "@" + Var("protobuf_rev"),
  Var("dart_root") + "/third_party/pkg/pub_semver":
      Var("dart_git") + "pub_semver.git" + "@" + Var("pub_semver_rev"),
  Var("dart_root") + "/third_party/pkg/pub":
      Var("dart_git") + "pub.git" + "@" + Var("pub_rev"),
  Var("dart_root") + "/third_party/pkg/shelf":
      Var("dart_git") + "shelf.git" + "@" + Var("shelf_rev"),
  Var("dart_root") + "/third_party/pkg/source_maps":
      Var("dart_git") + "source_maps.git" + "@" + Var("source_maps_rev"),
  Var("dart_root") + "/third_party/pkg/source_span":
      Var("dart_git") + "source_span.git" + "@" + Var("source_span_rev"),
  Var("dart_root") + "/third_party/pkg/sse":
      Var("dart_git") + "sse.git" + "@" + Var("sse_rev"),
  Var("dart_root") + "/third_party/pkg/stack_trace":
      Var("dart_git") + "stack_trace.git" + "@" + Var("stack_trace_rev"),
  Var("dart_root") + "/third_party/pkg/stream_channel":
      Var("dart_git") + "stream_channel.git" +
      "@" + Var("stream_channel_rev"),
  Var("dart_root") + "/third_party/pkg/string_scanner":
      Var("dart_git") + "string_scanner.git" +
      "@" + Var("string_scanner_rev"),
  Var("dart_root") + "/third_party/pkg/sync_http":
      Var("dart_git") + "sync_http.git" + "@" + Var("sync_http_rev"),
  Var("dart_root") + "/third_party/pkg/tar":
      Var("dart_git") + "external/github.com/simolus3/tar.git" +
      "@" + Var("tar_rev"),
  Var("dart_root") + "/third_party/pkg/term_glyph":
      Var("dart_git") + "term_glyph.git" + "@" + Var("term_glyph_rev"),
  Var("dart_root") + "/third_party/pkg/test":
      Var("dart_git") + "test.git" + "@" + Var("test_rev"),
  Var("dart_root") + "/third_party/pkg/test_descriptor":
      Var("dart_git") + "test_descriptor.git" + "@" + Var("test_descriptor_rev"),
  Var("dart_root") + "/third_party/pkg/test_process":
      Var("dart_git") + "test_process.git" + "@" + Var("test_process_rev"),
  Var("dart_root") + "/third_party/pkg/test_reflective_loader":
      Var("dart_git") + "test_reflective_loader.git" +
      "@" + Var("test_reflective_loader_rev"),
  Var("dart_root") + "/third_party/pkg/tools":
      Var("dart_git") + "tools.git" + "@" + Var("tools_rev"),
  Var("dart_root") + "/third_party/pkg/vector_math":
      Var("dart_git") + "external/github.com/google/vector_math.dart.git" +
      "@" + Var("vector_math_rev"),
  Var("dart_root") + "/third_party/pkg/watcher":
      Var("dart_git") + "watcher.git" + "@" + Var("watcher_rev"),
  Var("dart_root") + "/third_party/pkg/webdev":
      Var("dart_git") + "webdev.git" + "@" + Var("webdev_rev"),
  Var("dart_root") + "/third_party/pkg/webdriver":
      Var("dart_git") + "external/github.com/google/webdriver.dart.git" +
      "@" + Var("webdriver_rev"),
  Var("dart_root") + "/third_party/pkg/webkit_inspection_protocol":
      Var("dart_git") + "external/github.com/google/webkit_inspection_protocol.dart.git" +
      "@" + Var("webkit_inspection_protocol_rev"),
  Var("dart_root") + "/third_party/pkg/web":
      Var("dart_git") + "web.git" + "@" + Var("web_rev"),
  Var("dart_root") + "/third_party/pkg/web_socket_channel":
      Var("dart_git") + "web_socket_channel.git" +
      "@" + Var("web_socket_channel_rev"),
  Var("dart_root") + "/third_party/pkg/yaml_edit":
      Var("dart_git") + "yaml_edit.git" + "@" + Var("yaml_edit_rev"),
  Var("dart_root") + "/third_party/pkg/yaml":
      Var("dart_git") + "yaml.git" + "@" + Var("yaml_rev"),

  Var("dart_root") + "/buildtools/sysroot/linux": {
      "packages": [
          {
              "package": "fuchsia/third_party/sysroot/linux",
              "version": "git_revision:fa7a5a9710540f30ff98ae48b62f2cdf72ed2acd",
          },
      ],
      "condition": "host_os == linux",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/buildtools/sysroot/focal": {
      "packages": [
          {
              "package": "fuchsia/third_party/sysroot/focal",
              "version": "git_revision:fa7a5a9710540f30ff98ae48b62f2cdf72ed2acd",
          },
      ],
      "condition": "host_os == linux",
      "dep_type": "cipd",
  },

  # Keep consistent with pkg/test_runner/lib/src/options.dart.
  Var("dart_root") + "/buildtools/linux-x64/clang": {
      "packages": [
          {
              "package": "fuchsia/third_party/clang/linux-amd64",
              "version": Var("clang_version"),
          },
      ],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/buildtools/mac-x64/clang": {
      "packages": [
          {
              "package": "fuchsia/third_party/clang/mac-amd64",
              "version": Var("clang_version"),
          },
      ],
      "condition": "host_os == mac", # On ARM64 Macs too because Goma doesn't support the host-arm64 toolchain.
      "dep_type": "cipd",
  },
  Var("dart_root") + "/buildtools/win-x64/clang": {
      "packages": [
          {
              "package": "fuchsia/third_party/clang/windows-amd64",
              "version": Var("clang_version"),
          },
      ],
      "condition": "host_os == win", # On ARM64 Windows too because Fuchsia doesn't provide the host-arm64 toolchain.
      "dep_type": "cipd",
  },
  Var("dart_root") + "/buildtools/linux-arm64/clang": {
      "packages": [
          {
              "package": "fuchsia/third_party/clang/linux-arm64",
              "version": Var("clang_version"),
          },
      ],
      "condition": "host_os == 'linux' and host_cpu == 'arm64'",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/buildtools/mac-arm64/clang": {
      "packages": [
          {
              "package": "fuchsia/third_party/clang/mac-arm64",
              "version": Var("clang_version"),
          },
      ],
      "condition": "host_os == 'mac' and host_cpu == 'arm64'",
      "dep_type": "cipd",
  },

  Var("dart_root") + '/buildtools/reclient': {
    'packages': [
      {
        'package': 'infra/rbe/client/${{platform}}',
        'version': Var('reclient_version'),
      }
    ],
    # Download reclient only on the platforms where it has packages available.
    # Unfortunately windows-arm64 gclient uses x64 python which lies in
    # host_cpu, so we have to use a variable to not download reclient there.
    'condition': 'download_reclient and (((host_os == "linux" or host_os == "mac" or host_os == "win") and host_cpu == "x64") or (host_os == "mac" and host_cpu == "arm64"))',
    'dep_type': 'cipd',
  },

  Var("dart_root") + "/third_party/webdriver/chrome": {
    "packages": [
      {
        "package": "dart/third_party/chromedriver/${{platform}}",
        "version": "version:" + Var("chrome_tag"),
      }
    ],
    "condition": "download_chrome",
    "dep_type": "cipd",
  },

  Var("dart_root") + "/buildtools": {
      "packages": [
          {
              "package": "gn/gn/${{platform}}",
              "version": Var("gn_version"),
          },
      ],
      "condition": "host_os != 'win'",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/buildtools/win": {
      "packages": [
          {
              "package": "gn/gn/windows-amd64",
              "version": Var("gn_version"),
          },
      ],
      "condition": "host_os == 'win'",
      "dep_type": "cipd",
  },

  Var("dart_root") + "/buildtools/ninja": {
      "packages": [{
          "package": "infra/3pp/tools/ninja/${{platform}}",
          "version": Var("ninja_tag"),
      }],
      "dep_type": "cipd",
  },

  Var("dart_root") + "/third_party/android_tools/ndk": {
      "packages": [
          {
            "package": "flutter/android/ndk/${{os}}-amd64",
            "version": "version:r27.0.10869015"
          }
      ],
      "condition": "download_android_deps",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/android_tools/sdk/platform-tools": {
      "packages": [
          {
            "package": "flutter/android/sdk/platform-tools/linux-amd64",
            "version": "1tZc4sOxZS6FQIvT5i0wwdycmM8AO7QZY32FC9_HfR4C"
          }
      ],
      "condition": "download_android_deps",
      "dep_type": "cipd",
  },

  Var("dart_root") + "/third_party/fuchsia/sdk/linux": {
    "packages": [
      {
      "package": "fuchsia/sdk/core/${{platform}}",
      "version": Var("fuchsia_sdk_version"),
      }
    ],
    "condition": 'download_fuchsia_deps and host_os == "linux"',
    "dep_type": "cipd",
  },

  Var("dart_root") + "/third_party/fuchsia/test_scripts": {
    "packages": [
      {
      "package": "chromium/fuchsia/test-scripts",
      "version": "6FgM4KTbxxmyYoiOsPtkDPbHW4v_jnZXRxHJ1MvE4doC",
      }
    ],
    "condition": 'download_fuchsia_deps',
    "dep_type": "cipd",
  },

  Var("dart_root") + "/third_party/fuchsia/gn-sdk": {
    "packages": [
      {
      "package": "chromium/fuchsia/gn-sdk",
      "version": "ArgKhW3O86dFu3jHY4iET_azMrJygzWdDTdvE_AAS2AC",
      }
    ],
    "condition": 'download_fuchsia_deps',
    "dep_type": "cipd",
  },

  Var("dart_root") + "/pkg/front_end/test/types/benchmark_data": {
    "packages": [
      {
        "package": "dart/cfe/benchmark_data",
        "version": "sha1sum:5b6e6dfa33b85c733cab4e042bf46378984d1544",
      }
    ],
    "dep_type": "cipd",
  },

  # TODO(37531): Remove these cipd packages and build with sdk instead when
  # benchmark runner gets support for that.
  Var("dart_root") + "/benchmarks/FfiBoringssl/native/out/": {
      "packages": [
          {
              "package": "dart/benchmarks/ffiboringssl",
              "version": "commit:a86c69888b9a416f5249aacb4690a765be064969",
          },
      ],
      "dep_type": "cipd",
  },
  Var("dart_root") + "/benchmarks/FfiCall/native/out/": {
      "packages": [
          {
              "package": "dart/benchmarks/fficall",
              "version": "ebF5aRXKDananlaN4Y8b0bbCNHT1MnkGbWqfpCpiND4C",
          },
      ],
          "dep_type": "cipd",
  },
  Var("dart_root") + "/benchmarks/NativeCall/native/out/": {
      "packages": [
          {
              "package": "dart/benchmarks/nativecall",
              "version": "w1JKzCIHSfDNIjqnioMUPq0moCXKwX67aUfhyrvw4E0C",
          },
      ],
          "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/browsers/chrome": {
      "packages": [
          {
              "package": "dart/browsers/chrome/${{platform}}",
              "version": "version:" + Var("chrome_tag"),
          },
      ],
      "condition": "download_chrome",
      "dep_type": "cipd",
  },
  Var("dart_root") + "/third_party/browsers/firefox": {
      "packages": [
          {
              "package": "dart/browsers/firefox/${{platform}}",
              "version": "version:" + Var("firefox_tag"),
          },
      ],
      "condition": "download_firefox",
      "dep_type": "cipd",
  },
}

deps_os = {
  "win": {
    Var("dart_root") + "/third_party/cygwin":
        Var("chromium_git") + "/chromium/deps/cygwin.git" + "@" +
        "c89e446b273697fadf3a10ff1007a97c0b7de6df",
    Var("dart_root") + "/third_party/crashpad/crashpad":
        Var("chromium_git") + "/crashpad/crashpad.git" + "@" +
        Var("crashpad_rev"),
    Var("dart_root") + "/third_party/mini_chromium/mini_chromium":
        Var("chromium_git") + "/chromium/mini_chromium" + "@" +
        Var("minichromium_rev"),
    Var("dart_root") + "/third_party/googletest":
        Var("fuchsia_git") + "/third_party/googletest" + "@" +
        Var("googletest_rev"),
  }
}

hooks = [
  {
    # Generate the .dart_tool/package_confg.json file.
    'name': 'Generate .dart_tool/package_confg.json',
    'pattern': '.',
    'action': ['python3', 'sdk/tools/generate_package_config.py'],
  },
  {
    # Generate the sdk/version file.
    'name': 'Generate sdk/version',
    'pattern': '.',
    'action': ['python3', 'sdk/tools/generate_sdk_version_file.py'],
  },
  {
    'name': 'buildtools',
    'pattern': '.',
    'action': ['python3', 'sdk/tools/buildtools/update.py'],
  },
  {
    # Update the Windows toolchain if necessary.
    'name': 'win_toolchain',
    'pattern': '.',
    'action': ['python3', 'sdk/build/vs_toolchain.py', 'update'],
    'condition': 'checkout_win'
  },
  # Install and activate the empscripten SDK.
  {
    'name': 'install_emscripten',
    'pattern': '.',
    'action': ['python3', 'sdk/third_party/emsdk/emsdk.py', 'install',
        Var('emsdk_ver')],
    'condition': 'download_emscripten'
  },
  {
    'name': 'activate_emscripten',
    'pattern': '.',
    'action': ['python3', 'sdk/third_party/emsdk/emsdk.py', 'activate',
        Var('emsdk_ver')],
    'condition': 'download_emscripten'
  },
  {
    'name': 'Erase arch/ from fuchsia sdk',
    'pattern': '.',
    'action': [
      'rm',
      '-rf',
      'sdk/third_party/fuchsia/sdk/linux/arch',
    ],
    'condition': 'download_fuchsia_deps'
  },
  {
    'name': 'Download Fuchsia system images',
    'pattern': '.',
    'action': [
      'python3',
      'sdk/build/fuchsia/with_envs.py',
      'sdk/third_party/fuchsia/test_scripts/update_product_bundles.py',
      'terminal.x64,terminal.qemu-arm64',
    ],
    'condition': 'download_fuchsia_deps'
  },
  {
    'name': 'Generate Fuchsia GN build rules',
    'pattern': '.',
    'action': [
      'python3',
      'sdk/build/fuchsia/with_envs.py',
      'sdk/third_party/fuchsia/test_scripts/gen_build_defs.py',
    ],
    'condition': 'download_fuchsia_deps'
  },
]
