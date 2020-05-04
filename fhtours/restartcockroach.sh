docker stop roach1 roach2 roach3

docker rm roach1 roach2 roach3


docker run -d --name=roach1 --hostname=roach1 --net=roachnet -p 26257:26257 -p 8080:8080 cockroachdb/cockroach:v19.2.6 start --insecure --join=roach1,roach2,roach3

docker run -d --name=roach2 --hostname=roach2 --net=roachnet cockroachdb/cockroach:v19.2.6 start --insecure --join=roach1,roach2,roach3

docker run -d --name=roach3 --hostname=roach3 --net=roachnet cockroachdb/cockroach:v19.2.6 start --insecure --join=roach1,roach2,roach3

docker exec -it roach1 ./cockroach init --insecure
