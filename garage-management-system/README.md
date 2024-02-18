** Customers Table:
--------------------
```customer_id (Primary Key)
first_name
last_name
email
phone
address
... (other relevant customer details)
```


** Bikes Table:
--------------------
```
bike_id (Primary Key)
customer_id (Foreign Key referencing Customers Table)
make
model
year
color
license_plate
... (other relevant bike details)
```
** Service Requests Table:
---------------------------
```
request_id (Primary Key)
bike_id (Foreign Key referencing Bikes Table)
request_date
status (e.g., pending, in-progress, completed)
description
... (other relevant service request details)
```

** Service Technicians Table:
-----------------------------
```
technician_id (Primary Key)
first_name
last_name
specialization (e.g., engine, brakes, electrical)
... (other relevant technician details)
```
** Service Assignments Table:
-----------------------------
```
assignment_id (Primary Key)
request_id (Foreign Key referencing Service Requests Table)
technician_id (Foreign Key referencing Service Technicians Table)
assignment_date
status (e.g., assigned, in-progress, completed)
... (other relevant assignment details)
```

** Parts Inventory Table:
--------------------------
```
part_id (Primary Key)
part_name
quantity_available
price
... (other relevant part details)
```

** Service History Table:
--------------------------
```
history_id (Primary Key)
request_id (Foreign Key referencing Service Requests Table)
technician_id (Foreign Key referencing Service Technicians Table)
service_date
comments
... (other relevant service history details)
```