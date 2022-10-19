using System;

namespace YouTubeEgitim
{
    class Program
    {
        static void Main(string[] args)
        {
            /*int[] sayilar1 = new[] { 1, 2, 3};
            int[] sayilar2 = new[] { 340, 20, 30 };

            sayilar1 = sayilar2; 
            sayilar2[0] = 1000;
             Console.WriteLine(sayilar1[0];
            

            CreditManager creditManager = new CreditManager(); // Instance creation, creating a referance at Heap.
            creditManager.Calculate();
            creditManager.Save();

            Customer customer = new Customer();
            customer.Id = 1;
            customer.City = "Ankara";

            CustomerManager customerManager = new CustomerManager(customer);
            customerManager.Add();
            customerManager.Add();
            customerManager.Add();
            customerManager.Add();
            customerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "376487627";
            company.CompanyName = "Philips";
            company.Id = 120;

            CustomerManager customerManager1 = new CustomerManager(new Person());


            Person person = new Person();
            person.NationalIdenity = "763487364";
            person.FirstName = "Aytun";
            person.LastName = "BAYIR";
            */
            //interfaces
            //IoC 
            CustomerManager customerManager = new CustomerManager(new Customer (), new TeacherCreditManager());
            customerManager.GiveCredit();
            customerManager.SaveCredit();
            
        }
    }

    class CreditManager
    {
        public void Calculate(int creditType)
        {
            
            Console.WriteLine("Hesaplandi");
        }

        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }

    }

    interface ICreditManager 
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManafer : ICreditManager
    {
        public abstract  void Calculate();
        
        public virtual  void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManafer , ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Ogretmen kredisi hesaplandi");
        }

        public override void Save()
        {
            //base.Save();
            Console.WriteLine("KAYDEDILDI");
        }
    }

    class MilitaryCreditManager :BaseCreditManafer , ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandi");
        }
       
    }

    //SOLID--> Single responsibilty
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Musteri Nesnesi Baslatildi");
        }
        public int Id { get; set; }
        
        public string City { get; set; }
    }
    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdenity { get; set; }
    }

    class Company : Customer
    {
        public string TaxNumber { get; set; }
        public string CompanyName { get; set; }
    }

    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager )
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Add()
        {
            Console.WriteLine("Musteri Eklendi: " );
        }
        public void Delete()
        {
            Console.WriteLine("Musteri Silindi: " );
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }

        public void SaveCredit()
        {
            _creditManager.Save();
        }



    }
}
