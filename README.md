# Minecraft Mod Boilerplate

This is my custom Minecraft mod boilerplate built with Quilt and Kotlin. It is based off the [official mod template](https://github.com/QuiltMC/quilt-template-mod)

## Usage

In order to use this mod as a template:

1. Create a new repository from this template
    - If you use GitLab for a VCS
        - Go to [this](https://gitlab.com/projects/new#import_project) link and click on "Repository by URL".
        - Fill in `https://gitlab.com/Identithree/mc-modbp.git` as the git repository url
            - You don't need to mirror or input a username/password
        - Configure the repository name, location, and slug.
    - If you use GitHub for a VCS
        - Go to [this](https://github.com/new/import) link and fill in `https://gitlab.com/Identithree/mc-modbp.git`
        - Customize the repository location and name`
2. Clone the recently-created repo on your PC
3. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your Maven group and mod ID
        - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `io.github.<Your_Username_Here>`
    - Update `quilt.mod.json` in order to reflect your mod's metadata
        - If you are planning to include (jar-in-jar) a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - If you use `LICENSE.md`, don't forget to update the buildscript in order to use that file name!
        - In `quilt.mod.json`, don't forget to put the license's [SPDX identifier](https://spdx.org/licenses/) under the `"license"` property in `"metadata"`.
        - The GPLv3 and AGPLv3 are not valid mod licenses, so you can use almost any license except for those.
    - Update the Java subdirectory structure so it reflects your Maven group
    - If the dependencies on `gradle/libs.versions.toml` isn't up-to-date, feel free to update them! The linked utility should help you in this easy and quick process.
4. The mod is now ready to be worked on!

## License

This template is licensed under the [Creative Common Zero v1.0 license](./LICENSE-TEMPLATE.md).

Mods created with this template are not automatically licensed under the CC0, and are not required to give any kind of credit back to QuiltMC or myself for this template.

## Logo

The logo for this repository comes from the minecraft launcher icon from the [Papirus icon theme](https://git.io/papirus-icon-theme).
Please note that this does not count towards the [icon passed to the loader](src/main/resources/assets/mod/icon.png), only the icon that is on the GitLab repository.
