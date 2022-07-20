# simpleTasksJava

- Maximum, minimum and average value
- Sorting the array
- Search for prime numbers
- Deleting from the array
- Filtering of high-frequency noise using BPA, digital processing of multidimensional signals


# javaSimpleTasks

- ArrayList exercises [22 exercises]
- LinkedList Exercises [26 exercises]
- HashSet Exercises [12 exercises]
- TreeSet Exercises [16 exercises]
- Priority Queue Exercises [12 exercises]
- HashMap exercises [12 exercises]
- TreeMap exercises [26 exercises]

# filteringOfHighFrequencyNoiseUsingBPA

Use Adamar method for matrix


# just-another-app
It is necessary to develop a console application that processes the log file and counts:
• The number of successfully and unsuccessfully processed operations.
• Average processing time of operations in the context of successful / unsuccessful.
• Average execution time of the stages (Authentication, Authorization, Balances
modification) of processing operations in the context of successful / unsuccessful.

## Format of log messages:

Each message is located on a new line of the log file.
String format (Library notation logback.xml ):
• -%date{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %msg%n}
List of possible messages ( %msg ):
• “Operation processing [id=????] has been started.” — start
of operation processing.
• “Operation processing [id=????] has been finished.” —
successful end of operation processing.
• “Operation processing [id=????] has been failed.” —
unsuccessful end of operation processing.
• “Authentication has been started.” — the beginning
of the authentication process (performed as part of the operation processing).
• “Authentication has been finished.” — completion
of the authentication process (performed as part of the operation processing).
• “Authorization has been started.” — the beginning
of the authorization process (performed as part of the operation processing).
• “Authorization has been finished.” — completion
of the authorization process (performed as part of the operation processing).
• “Balances modification has been started.” — the beginning of the process
of changing balances (performed as part of the processing of the operation).
• “Balance modification has been finished.” — completion
of the process of changing balances (performed as part of processing
operations).

## Example output
Successful operation count: 3
Average operation successful processing time: 934ms
Failed operation count: 1
Average operation failed processing time: 300ms
Average Authentication time (for successful operations): 167ms
Average Authentication time (for failed operations): 100ms
Average Authorization time (for successful operations): 167ms
Average Authorization time (for failed operations): 100ms
Average Balance modification time (for successful operations): 600ms
Average Balance modification time (for failed operations): 100ms
