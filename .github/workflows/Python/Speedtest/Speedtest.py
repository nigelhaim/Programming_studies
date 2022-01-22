import sys
import subprocess

subprocess.check_call([sys.executable, '-m', 'pip', 'install', 
'speedtest-cli'])
import speedtest
print("_____________________\n")
print("Welcome to Speed test\n")
print("_____________________\n")

print("Press ctrl + c to interup operation this test is an infinite loop that will constantly test the internet\n")
tester = speedtest.Speedtest()

print ("Loading server list...")
tester.get_servers()

print("Choosing the best server...")
best_server = tester.get_best_server()
print(f"Found: {best_server['host']} ||  Location: {best_server['name']}, {best_server['country']} || Network: {best_server['sponsor']}")

print("\n\n")
i = 0
while (i < 10):
    download_result = tester.download()
    upload_result = tester.upload()
    ping = tester.results.ping
    print("========================================================================")
    print(f"Download Speed: {download_result * 0.000000125: .2f} MB/s | Upload Speed: {upload_result * 0.000000125: .2f} MB/s | Ping: {ping} ms \n")
    print(f"Download Speed: {download_result * 0.000001: .2f} mbps | Upload Speed: {upload_result * 0.000001: .2f} mbps | Ping: {ping} ms \n")
    print("========================================================================")

subprocess.check_call([sys.executable, '-m', 'pip', 'uninstall', 
'speedtest-cli',])