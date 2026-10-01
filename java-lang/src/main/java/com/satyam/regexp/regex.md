# Regex

A regular expression (regex) is fundamentally a sequence of characters that defines a search
pattern.

```text
abc...     Letters
123...     Digits
\d         Any digit
\D         Any non-digit character
.          Any character
\.         Period
[abc]      Only a,b or c
[^abc]     Not a,b nor c
[a-z]      Characters a to z
[0-9]      Numbers 0 to 9
\w         Any alphanumeric characters
\W         Any non-alphanumeric character
{m}        m repetitions
{m,n}      m to n repetitions
*          Zero or more repetitions
+          One or more repetitions
?          Optional character
\s         Any whitespace
\S         Any non-whitespace character
^...$      Starts and ends
(...)      Capture group
(a(bc))    Capture sub group
(.*)       Capture all
(abc|def)  Matches abc or def
```
