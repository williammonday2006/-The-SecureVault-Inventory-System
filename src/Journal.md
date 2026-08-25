Phase 1: I chose a private modifier as I have getter, setter methods. This is to largly make finding where, and how the methods are used easier for future proofing.

Phase 2: I chose to use super(itemName, itemValue); as it is what I am most familuar with. I could however also used protected variables so I could access them.

Phase 3: subclasses are also affected becuase its constructor calls the superclass using super(); becuase vualtitem already checks it, i dont need to in fragile item but i do still need to declare it as it is used in the superclass.