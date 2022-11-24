def gcd(m, n):
    if n > 0:
        a = m % n
        gcd(n, a)
    print(m)


print(gcd(60,39))