# nrepl usage

There are various ways to get an nrepl server going but here is a simple use
case.

## Instructions

* enter your sketch directory
* run `lein repl`
* in your repl run `(sketch.core/-main)`

### Why is this useful?

You can connect to the nrepl server from a client, keep main running and make
live modifications to your sketch instead of stopping and re-running like one
would normally do in processing. There are many options to connect remotely, i
use [conjure](https://github.com/Olical/conjure) which allows me to communicate
with the nrepl server by evaluating code from my neovim session.
