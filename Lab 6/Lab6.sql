use ncp;
create table Shipping(ProdName varchar(100),ProdZip varchar(5),ProdNum varchar(10),ProdImg varchar(255));
create table CityDetails(Zipcode varchar(5),City varchar(255));

select * from CityDetails;
select * from shipping;

insert into ncp.shipping values("Product1","36091","1234567891","https://capturemathan.github.io/");
insert into ncp.shipping values("Product2","36091","2345678912","http://rajkumaar.co.in/");
insert into ncp.shipping values("Product3","36758","3456789123","https://sathiyajith.github.io/");
insert into ncp.shipping values("Product4","36758","4567891234","https://flipkart.com/");
insert into ncp.shipping values("Product5","36006","5678912345","http://amazon.in/");
insert into ncp.shipping values("Product6","36006","6789123456","https://www.myntra.com/");
insert into ncp.shipping values("Product7","36067","7891234567","https://www.ebay.com/");
insert into ncp.shipping values("Product8","36067","8912345678","https://www.quikr.com/");
insert into ncp.shipping values("Product9","36701","9123456789","https://www.lenskart.com/");
insert into ncp.shipping values("Product10","36701","1234567890","https://paytm.com/");