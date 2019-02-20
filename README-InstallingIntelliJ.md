# Installing IntelliJ


1. First begin by installing HomeBrew by copying and pasting the command below into the terminal
    * `/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`
2. Next, `brew` an installation of java by copying and pasting the following 2 commands
   * `brew tap caskroom/versions`
   * `brew cask install java8`
2. After Java has been installed, copy and paste the following command in the terminal
    * `brew cask install intellij-idea`
3. Upon launching IntelliJ, ensure the [Apache Maven](https://maven.apache.org/) plugin is enabled.
   * From the menu bar found at the top of application, select `Plugins`, and ensure `Maven` is checked.
4. Ensure that a project is opened via its `pom.xml` located at the _root directory_ of the project.
   * When prompted, select `Open as Project`.
   * If prompted, select `Delete Existing Project and Import`.
    
