from http import client
import socket 
import threading

bind = "0.0.0.0" #use the ip add of where it is launched 

bind_port = 9999

server = socket.socker(socket.AF_INET, socket.SOCK_STREAM)
server.bomd(bind_ip, bind_port)
server.listen(5)
print("[*] Listening on %:%i" %(bind_ip,bind_ports))

def handleclient(client_socket):
    request = client_socket.recv(1024)
    print("[*] Recieved: %s" %(request.decode()))

    response = "Server Acknowledged!"
    client_socket.send(response.encode())
    client_socket.close()


while True:
    client, addr = server.accept()
    print("[*] Accepted Connection from %s:%i" %(addr[0], addr[1]))

    client_handler = threading.Thread(target=handleclient,args=(client,))
    client_handler.start()