class TicTacToe:    
    def printer(self, arr): 
        loc = 0 
        for i in range (3):
            for j in range(3):
                if j < 2:
                    print(" " + arr[loc], end = " |")
                else:
                    print(" " + arr[loc], end = "")
                loc += 1
            print()
            print("---|---|---")
    
    def setMovePlayer(self, arr, player, location):
        value = ''
        if player == 1:
            value = 'X'
        elif player == 2: 
            value = 'O'
        if location == int(arr[location - 1]):
            location -= 1
            arr[location] = value
        return arr
    def nextPlayer(self, arr, player, location):
            try:
                if location == int(arr[location - 1]):
                    return True

            except:
                return False

    def WinnerDecleration(self, arr):
        if arr[0] == arr[1] == arr[2]:
            return arr[0]
        elif arr[0] == arr[3] == arr[6]:
            return arr[0]
        elif arr[0] == arr[4] == arr[8]:
            return arr[0]
        elif arr[1] == arr[4] == arr[7]:
            return arr[1]
        elif arr[3] == arr[4] == arr[5]:
            return arr[3]
        elif arr[8] == arr[7] == arr[6]:
            return arr[6]
        elif arr[2] == arr[5] == arr[8]:
            return arr[2]
        elif arr[2] == arr[4] == arr[6]:
            return arr[2]
        else:
            return "None"
print("========================")
print("WELCOME TO TIC TAC TOE")
print("========================")
print("By: Nigel Sebastian")
print()
arr=[
    '1', '2', '3',
    '4', '5', '6',
    '7', '8', '9'
    ]


game = TicTacToe()
player_Uno = input("Set player 1 Name: ")
player_Dos = input("Set player 2 Name: ")
player = 1
location = -100
for ingame in range(9):
    game.printer(arr)
    if player == 1: 
        print(player_Uno + ": ", end = '')
    elif player == 2:
        print (player_Dos +     ": ", end = '')
    location = int(input())
    if game.nextPlayer(arr, player, location) == True:
            arr = game.setMovePlayer(arr, player, location)
            if player == 1:
                player = 2
            elif player == 2:
                player = 1
    else:
        print("Invalid location try again!")
    print()
    status = game.WinnerDecleration(arr)

    if status == 'X' or status == 'O':
        if status == 'X':
            print(player_Uno, " Wins!")
        elif status == 'O':
            print(player_Dos, " Wins!")
        elif status == 'None':
            print("Tie")
        print()
        game.printer(arr)
        break

print()
if game.WinnerDecleration(arr) == "None":
    print()
    print("Match Result: Tie")
    print("Thanks for Playing!")
else:
    print()
    print("Thanks for Playing!")