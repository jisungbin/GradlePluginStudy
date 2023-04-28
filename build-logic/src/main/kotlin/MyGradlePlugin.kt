import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register

class MyGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("[${project.name}] Applied MyGradlePlugin")

        val extension = project.extensions.create<MyGradlePluginExtension>(
            name = "myGradlePlugin",
            project,
        )
        project.tasks.register<MyGradlePluginTask>(
            name = "myGradlePlugin",
            extension,
        )
    }
}
