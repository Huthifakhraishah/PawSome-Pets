# PaweSome-Pets

## **Abstract:**
#### *Our main idea is about pets care; it’s like a hospital to keep more animals in loving homes by protecting them from harmful situations through community engagement, preventative action and providing resources and care when needed. So we decide to make a website that helps all pets owners, and provide them all the care and requirements they need. We care about pets and want them to be safe in wherever they are, whether is’t their home or shelter. The website will be responsive, it will contain a navbar that includes Home, Services, About Us, Login and Registration page. The user can add his own pets, then he can choose the service needed for his pet and the appropriate time for it. The user can also read about the services. There will be a use of API where we include a map. Spring Security will also be used for distributing the roles between the user and the administrator.*

## Run 
Using Spring Tool Suit ```import an existing Maven project```, then choose the path where .mvn directory exist. Now ```run as  Spring Boot App```. Finally, navigate to ```http://localhost:8080/```.

### Common Features Between All Pages
    * There is a changing navbar that contains different routes depending on the user's role, whether they are an administrator, user or guest.
    * There is a sticky navbar that appears while scrolling that refers to some useful pages fot the user.
    * There is a Top button that sends the user right back to the beginning of the page.

### Main functionalities
#### Login 
    * This is where the user or the administrator will login.
    * There is a validation to inform the user or administrator when their information entered are wrong.
![Login](https://user-images.githubusercontent.com/81507185/125005516-35d9a080-e05c-11eb-9e46-3ddf5d2b9b52.png)

#### Registration
  * There is a validation for the information entered.
  * Password must be greater than 5 characters.
  * Username must be greater than 3 characters.
![Registration](https://user-images.githubusercontent.com/81507185/125005567-586bb980-e05c-11eb-9820-3bd8f2103ca0.png)

#### Home Page
    * This is the page a user sees when they log in.
![Home Page](https://user-images.githubusercontent.com/81507185/125005622-7e915980-e05c-11eb-83ff-6ca8e0f834cd.png)

#### Profile
    * This page does not appear to guests. 
    * This is where the user can add their own pets.
    * This is also where the user can browse their added pets.
    * If a pet was clicked on, the user will be sent to a page that shows the services booked for that specific pet.
![Profile](https://user-images.githubusercontent.com/81507185/125005315-be0b7600-e05b-11eb-9277-90f549632440.png)

#### Pet profile
    * This page contains the services applied for a specific pet.

#### Apply Page
    * Here, a user can apply for a service and choose the pet to give the service for. He is also asked to choose the appointment's date.
![Apply Page](https://user-images.githubusercontent.com/81507185/125006229-e8f6c980-e05d-11eb-8389-33d95e63a300.png)

#### Services
    * This page contains all the services provided. One can click on any service and they will be sent to a page that shows information about it.
![Services](https://user-images.githubusercontent.com/81507185/125005397-f27f3200-e05b-11eb-9b23-ca2a4d7839d6.png)

#### Services Info
    * This is where the user can learn more about the offered service.
![Service info page](https://user-images.githubusercontent.com/81507185/125006045-7be33400-e05d-11eb-9571-ed2ee220ff14.png)

#### Admin Dashboard
    * This page is only for the admin to reach.
    * This page is where the admin can insert new categories, services and appointments.
![Admin Dashboard](https://user-images.githubusercontent.com/81507185/125005900-3161b780-e05d-11eb-8459-578d64b8a138.png)

#### Edit Categories/ Services/ Appointments Pages
    * These are actually three separate pages, where only the admin can reach.
    * In these pages, the admin have the ability to edit categories, services or appointments. 
    * In these pages, thr admin have the ability to delete categories, services or appointments.
![Edit and Delete Categories](https://user-images.githubusercontent.com/81507185/125005860-17c07000-e05d-11eb-8126-5119b1619d30.png)
![Edit and Delete Services](https://user-images.githubusercontent.com/81507185/125005937-40e10080-e05d-11eb-8679-27ebaab39299.png)
![Edit and Delete Appointments](https://user-images.githubusercontent.com/81507185/125005995-60782900-e05d-11eb-994c-dc08fe826638.png)

#### About us
    * This page contains an API which is a map from Google.
    * This page contains a button that redirects the user to the services page.
![About Us Page](https://user-images.githubusercontent.com/81507185/125005414-fa3ed680-e05b-11eb-9b1c-a6ac859e8e4e.png)

#### Technologies Used
![htmlcss](https://user-images.githubusercontent.com/81507185/125007096-cf568180-e05f-11eb-88a1-03bb913897d2.png)
![jquery](https://user-images.githubusercontent.com/81507185/125007103-d41b3580-e05f-11eb-8a50-e5a14add0ff0.png)
![spring](https://user-images.githubusercontent.com/81507185/125007110-d7aebc80-e05f-11eb-8f5f-cc1184697965.png)

## Authors:
1. Haitham Estetieh 
2. Huthifa Khraishah  
3. Qamar Dajani
4. Yousef Swailem
    
