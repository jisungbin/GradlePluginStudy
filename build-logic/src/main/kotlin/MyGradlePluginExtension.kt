import javax.inject.Inject
import org.gradle.api.Project

open class MyGradlePluginExtension @Inject constructor(project: Project) {
    open var message = project.name
}
