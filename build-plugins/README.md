# Convention Plugins
The `build-plugins` folder defines project specific convention plugins, used to keep a single 
source of truth for common module configurations.

This approach has been adopted from the 
[NowInAndroid](https://www.github.com/android/nowinandroid/tree/main/build-logic) app.

By setting up convention plugins, we can avoid duplicated build script setup, messy `subproject` 
configurations, without the pitfalls of the `buildSrc` directory.

`build-plugins` is included in the builds, as configured in the root 
[`settings.gradle.kts`](../settings.gradle.kts).

Inside `build-plugins` is a `convention` module, which defines a set of plugins that all modules 
can use to configure themselves.

`build-plugins` also includes a set of `Kotlin` files used to share logic between plugins 
themselves, which is most useful for configuring Android components (libraries vs application) 
with shared code.

These plugins are *additive* and *composable*, and try to only accomplish a single responsibility.
Modules can then pick and choose the configurations they need.
If there is one-off logic for a module without shared code, its preferable to define that directly 
in the module's `build.gradle`, as opposed to creating a convention plugin with module-specific 
setup.

Current list of convention plugins:

- [`androidplaygrounds.android.application`](convention/src/main/kotlin/AndroidAppConventionPlugin.kt),
  [`androidplaygrounds.android.library`](convention/src/main/kotlin/AndroidLibConventionPlugin.kt):
  Configures common Android and Kotlin options.
- [`androidplaygrounds.android.application.compose`](convention/src/main/kotlin/AndroidAppComposeConventionPlugin.kt),
  [`androidplaygrounds.android.library.compose`](convention/src/main/kotlin/AndroidLibComposeConventionPlugin.kt):
  Configures Jetpack Compose options.
- [`androidplaygrounds.android.feature`](convention/src/main/kotlin/AndroidFeatureConventionPlugin.kt):
  Configures common options required by [`feature`](../feature) modules.
