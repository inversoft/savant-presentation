import org.savantbuild.domain.Project
import org.savantbuild.output.Output
import org.savantbuild.plugin.groovy.BaseGroovyPlugin
import org.savantbuild.runtime.RuntimeConfiguration

/**
 * @author Brian Pontarelli
 */
class MyPlugin extends BaseGroovyPlugin {
  public MyPlugin(Project project, RuntimeConfiguration runtimeConfiguration, Output output) {
    super(project, runtimeConfiguration, output)
  }

  def doSomethingCool() {
    println "Hello World (from plugin)"
  }
}
