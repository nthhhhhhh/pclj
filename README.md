# pclj

A Leiningen template for working with Processing in Clojure.

## Usage

This is MacOS only by default but can be changed to any platform. Simply modify
the directories in the generated `project.clj`.

Enter the cloned directory then run 
* `lein install`
* move to a directory where you want to create a project
* `lein new pclj/new sketch`
* enter sketch directory
* `lein run` should get you a sketch window.

### See Also
* [quil](https://github.com/quil/quil) is a polished experience but I found I would rather work directly with processing
* this setup works well with [nrepl](https://nrepl.org/nrepl/0.9/index.html), see NREPL_USAGE.md for details.

