import socket 

target_host = "192.168.254.101"
target_port = 9999

client = socket.socket(socket.AF_INET, sockert.SOCK_STREAM)
client.connect((target_host.target_port))

message = input("Enter your message: ")
client.send(message.encode())

response = client.recv (1994)