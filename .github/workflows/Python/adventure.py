class Character:
    def SetClass(self, character):
        self.character_Class = character
    def SetWeapon(self, weapon):
        self.weapon = weapon
    def SetAbility(self, ability1, ability2, ability3):
        self.ability1 = ability1
        self.ability2 = ability2
        self.ability3 = ability3

Player1 = Character()

print("Choose your character: \n 1. Wizard \n 2. Knight \n 3. Archer \n 4. Assassin")
select_character = 0 
select_weapon = 0 
while 1 > select_character or 4 < select_character:
    try:
        select_character = int(input("Character:"))
    except ValueError:
        print("Choose your character: \n 1. Wizard \n 2. Knight \n 3. Archer \n 4. Assassin")

if select_character == 1:
    Player1.SetClass("Wizard")
    print("Choose your abilities: \n 1. Energy Ball \n 2. Dragons Breath \n 3. Crown of Flame \n 4. Hail Storm")
    a1 = (input("Ability 1: "))
    a2 = (input("Ability 2: "))
    a3 = (input("Ability 3: "))
    Player1.SetAbility(a1, a2, a3)
elif select_character == 2:
    Player1.SetClass("Knight")
    print("Choose your abilities: \n 1. Fire Slash \n 2. Power Slash \n 3. Gigantic Storm \n 4. Chaotic Disaster")
    a1 = (input("Ability 1: "))
    a2 = (input("Ability 2: "))
    a3 = (input("Ability 3: "))
    Player1.SetAbility(a1, a2, a3)
elif select_character == 3:
    Player1.SetClass("Archer")
    print("Choose your abilities: \n 1. Take Aim \n 2. Quick Shot \n 3. Blazing Arrow \n 4. Frost Arrow")
    a1 = (input("Ability 1: "))
    a2 = (input("Ability 2: "))
    a3 = (input("Ability 3: "))
    Player1.SetAbility(a1, a2, a3)
elif select_character == 4:
    Player1.SetClass("Assassin")
    print("Choose your abilities: \n 1. Cloaking \n 2. Enchant Poison \n 3. Sonic Acceleration \n 4. Meteor Assult")
    a1 = (input("Ability 1: "))
    a2 = (input("Ability 2: "))
    a3 = (input("Ability 3: "))
    Player1.SetAbility(a1, a2, a3)

print("Choose your weapon: \n 1. Wizard Staff \n 2. Sword \n 3. Bow & Arrow \n 4. Katar")
while 1 > select_weapon or 5 < select_weapon:
    try:
        select_weapon = int(input("Weapon:"))
    except ValueError:
        print("Choose your weapon: \n 1. Wizard Staff \n 2. Sword \n 3. Bow & Arrow \n 4. Katar")

if select_weapon == 1:
    Player1.SetWeapon("Wizard Staff")
elif select_weapon == 2:
    Player1.SetWeapon("Sword")
elif select_weapon == 3:
    Player1.SetWeapon("Bow & Arrow")
elif select_weapon == 4:
    Player1.SetWeapon("Katar")

print("\n")
print("Your character is: ")
print(Player1.character_Class)
print(Player1.weapon)
print(Player1.ability1)
print(Player1.ability2)
print(Player1.ability3)