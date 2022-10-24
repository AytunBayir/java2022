--Select
--ANSII
Select ContactName Adi,CompanyName SirketAdi,City Sehir 
from Customers -- baslik isimlerini degotirmis olduk

Select * 
from Customers 
where City = 'London'

--Case insensitive
select * 
from Products 
where categoryId = 1 or CategoryId = 3 

select * 
from Products 
where categoryId = 1 and UnitPrice >= 10 --kategorisi 1 ve 3 olanlari getir

select *
from Products 
order by UnitPrice desc -- descending, azalan sekilde siralamak

select *
from Products
order by UnitPrice asc -- ascending, artan sekilde siralamak
 
select *
from Products
where CategoryID=1 
order by UnitPrice desc

select count(*) 
from Products -- butun sutun sayar

select count(*) 
from Products where CategoryID = 2 -- kategori id si 2 olan sutunlarin sayisi

select CategoryID, count(*) 
from products 
where UnitPrice>20 
group by CategoryID 
having count(*)<10 -- birim fiyati 20 den buyuk olan categori id lerin sayisi 10 dan gucuk olanlri getir

select*
from Products 
inner join Categories 
on Products.CategoryID=Categories.CategoryID 

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID
where products.UnitPrice<10

--DTO --> Data Transformation Object

select*from Products p inner join [Order Details] od 
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.CustomerID

select*from Customers c left join Orders o -- solda olup sagda olmayan verileri goster
on c.CustomerID=o.CustomerID
where o.CustomerID is null
