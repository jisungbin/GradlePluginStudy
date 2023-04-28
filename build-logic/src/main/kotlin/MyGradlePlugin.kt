import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register

class MyGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            println("Applied MyGradlePlugin")
            val extension = extensions.create<MyGradlePluginExtension>("myGradlePlugin")

            afterEvaluate {
                tasks.register<MyGradlePluginTask>("myGradlePlugin", extension)
            }
        }
    }
}
