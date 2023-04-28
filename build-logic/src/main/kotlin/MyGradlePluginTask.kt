import javax.inject.Inject
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class MyGradlePluginTask @Inject constructor(
    private val extension: MyGradlePluginExtension,
) : DefaultTask() {
    @TaskAction
    fun run() {
        println("Working MyGradlePluginTask: ${extension.message}")
    }
}
