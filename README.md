# JDA Slash Command Handler

### WARNING: This is just a sample program, but nothing prevents you from using working classes

# Using

> Main class is `SlashCommandManager.java`</br>
> It takes an instance of the JDA class as parameters

* To start the listener, you need to call the `.listen()`
* To add a command, call the `.addCommand(SlashCommand)` method. An instance of the command class must be passed to the
  method. Or call the `.addCommands(SlashCommand ... varargs)` method
* To create a command, inherit the abstract class `SlashCommand` and implement the `execute()` method and
  constructor. [Example](https://github.com/cramatsu/slash-command-handler/blob/master/src/example/java/commands/Ping.java)

# Example

**[Program example](https://github.com/cramatsu/slash-command-handler/tree/master/src/example/java)**

---


**[Contact with me](https://linktr.ee/cramatsu)**