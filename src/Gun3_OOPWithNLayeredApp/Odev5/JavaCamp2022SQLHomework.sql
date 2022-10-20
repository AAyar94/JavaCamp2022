	--select
	--ANSII
	select ContactName Adi,CompanyName Şirket,City Şehir from Customers

	select * from Customers where city='Berlin'

	select * from Products where CategoryID=1 or CategoryId=3

	select * from Products where CategoryID=1 and UnitPrice>=10

	select * from Products where CategoryID=1 order by UnitPrice desc --ascending(Artan)  --desc(azalan)

	select count(*) Adet from Products where CategoryID=2

	select CategoryID,count(*) NumberofProducts from Products group by CategoryID

	select CategoryID,count(*) NumberofProducts from Products where Unitprice>20 group by CategoryID having count(*)<10

	select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID where products.UnitPrice>10

	select * from Products p left join [Order Details] od on p.ProductID = od.ProductID

	select * from Customers c inner join Orders o on c.CustomerID = o.CustomerID

    select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null

	select * from Products p left join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID=od.OrderID

