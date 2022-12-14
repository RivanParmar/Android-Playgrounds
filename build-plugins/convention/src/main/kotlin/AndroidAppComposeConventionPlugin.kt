import com.android.build.api.dsl.ApplicationExtension
import com.rivan.androidplaygrounds.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidAppComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            // TODO: Remove "com.android.application" plugin from here if not required
            pluginManager.apply("com.android.application")
            val extension = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extension)
        }
    }
}