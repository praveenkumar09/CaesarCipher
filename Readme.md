**1. Caesar Cipher Algorithm :**
   i It is a symmetric private key crypto system used back in the Roman Empire.
   ii.It is a substitution cipher - we shift all the letters of the plain text with a fixed number of letters.
   Iii. The Private key is the value with which we shift all the letters.
   **E(x) = (x+n) mod 26 - Encryption formulae**
   i. We have to consider all the characters in the plain text.
   ii. E(x) is the encrypted letter of the original x letter.
   iii. We have to shift the given letter with n (where en is the key)
   iv. We want to make sure ht encrypted letter is within the range [0-25] so that is why we use mod26.  
   **D(x) = (x-n) mod 26 - Decryption formulae**