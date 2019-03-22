# cs1302-ce21 Fun with Components and Containers

> Words, words, words.
> **-- William Shakespeare, _Hamlet_**

This class exercise explores creating custom JavaFX components by extending (inheriting from) existing
JavaFX components. 

## References and Prerequisites

* [CSCI 1302 JavaFX 8 Bookmarks and Notes](http://cobweb.cs.uga.edu/~mec/cs1302/gui/)
* [CSCI 1302 JavaFX Custom Component Tutorial](https://github.com/cs1302uga/cs1302-tutorials/components/components.md)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce21`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce21.git
   ```

1. Change into the `cs1302-ce21` directory that was just created and look around. There is 
   pretty much nothing there! That's intentional. Continue on to the 
   [Exercise Steps](#exercise-steps) below.
   
### Exercise Steps

1. Copy over your work from the `src/cs1302/gui` directory of `cs1302-components`
   into the `src/cs1302/ce21` directory of `cs1302-ce21` and update the package
   statements accordingly (i.e., make sure the package is `cs1302.ce21`). 
   **You should create `src/cs1302/ce21` if it does not exist.**
   
1. If you did not finish 
   [CSCI 1302 JavaFX Custom Component Tutorial](https://github.com/cs1302uga/cs1302-tutorials/components/components.md), 
   then finish that work in the code you just copied over. The end goal is to reduce
   the containment hierarchy from this:
   
   ```
                                                             --|
                         Stage                                 |
                           |                                   |
                         Scene                                 |
          |--              |                                   |
          |               HBox                                 |
          |                |\                                  |
          |                | \------------------\              |
          |                |                    |              |
          |               VBox                 VBox            | Overall
          |               / \                  / \             | Containment
   Scene  |              /   \                /   \            | Hierarchy
   Graph  |            HBox  ImageView      HBox  ImageView    |
          |            / \                  / \                |
          |           /   \                /   \               |
          |    TextField  Button    TextField  Button          |
          |--                                                --|
   ```   
   
   to something like this:
   
   ```
                                                             --|
                         Stage                                 |
                           |                                   |
                         Scene                                 |
          |--              |                                   | Overall
          |               HBox                                 | Containment
   Scene  |                |\                                  | Hierarchy
   Graph  |                | \------------------\              |
          |                |                    |              |
          |           ImageLoader          ImageLoader         |
          |--                                                --|
   ```
   
1. **Compile and run your code without any errors or warnings.**
   Also stage and commit your changes.
   
1. Tag your commit so that it's easier to checkout at a later
   point in time:
   
   ```
   $ git tag tutorial
   ```
   
   [Tagging](https://git-scm.com/book/en/v2/Git-Basics-Tagging) allows us
   to give the commit a more convenient name to a commit than its
   hexademical checksum.

**CHECKPOINT**   
   
1. Now, read the class-level API documentation for the
   [`TilePane`](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/TilePane.html)
   class, then adapt your code to replace the highest `HBox` in the 
   containment hiearchy with a `TilePane` object.
   
   * The `TilePane` object's `prefColumns` should be set to `4` using the appropriate setter
     method.
     
   * The `TilePane` object should have four `ImageLoader` objects as its children.
   
   Here is the corresponding containment hierarchy for what is expected:
   
   ```
                                                             --|
                              Stage                            |
                                |                              |
                              Scene                            |
          |--                   |                              | Overall
          |                 TilePane                           | Containment
   Scene  |                    /|\                             | Hierarchy
   Graph  |          /--------/ | \--------\                   |
          |         /          / \          \                  |
          |      ImageLoader  /   \        ImageLoader         |
          |                  /     \                           |
          |        ImageLoader     ImageLoader                 |
          |--                                                --|
   ```
   
1. **Compile and run your code without any errors or warnings.**
   Also stage and commit your changes.
   
1. Now, increase the number of `ImageLoader` objects to `8`. This
   should be easy if you used a loop.
   
1. Tag your commit so that it's easier to checkout at a later
   point in time:
   
   ```
   $ git tag tilepane
   ```
      
**CHECKPOINT**

1. Now, read the class-level API documentation for the
   [`TabPane`](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TabPane.html)
   and [`Tab`](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Tab.html)
   classes, then adapt your code to replace the `TilePane` in the 
   containment hiearchy with a `TabPane` object.
    
   * The `TabPane` object should have four `Tab` objects, each containing an `ImageLoader` object
     as its child.
   
   Here is the corresponding containment hierarchy for what is expected:
   
   ```
                                                             --|
                              Stage                            |
                                |                              |
                              Scene                            |
          |--                   |                              | Overall
          |                  TabPane                           | Containment
   Scene  |                    /|\                             | Hierarchy
   Graph  |          /--------/ | \--------\                   |
          |        Tab          |          Tab                 |
          |        /           / \           \                 |
          |     ImageLoader  Tab Tab         ImageLoader       |
          |                  /     \                           |
          |        ImageLoader     ImageLoader                 |
          |--                                                --|
   ```
   
1. **Compile and run your code without any errors or warnings.**
   Also stage and commit your changes.
   
1. Tag your commit so that it's easier to checkout at a later
   point in time:
   
   ```
   $ git tag tabpane
   ```
   
**CHECKPOINT**  

1. View the condensed, graphical version of your Git log.
   Since you tagged each relevant commit with a name, you
   can go back in time by checking out those commits more
   easily. For example,
   
   ```
   $ git checkout tutorial
   $ rm -rf bin/*
   ```
   
   Then, compile and run to see what your exercise looked like
   at that point in time!

**NOT A CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
