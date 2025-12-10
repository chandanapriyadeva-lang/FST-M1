class car:

   def __init__(self,manufacturer,model,make,transmission,color):
    self.manufacturer=manufacturer
    self.model=model
    self.make=make
    self.transmission=transmission
    self.color=color


   def accelerate(self):
      print(self.manufacturer+" ," +self.model+ " "+" is moving")
   def stop(self):
      print(self.manufacturer+" ," +self.model+ " "+"has stopped")
      
c1=car("Toyota","mod1","2025","manual","pink")
c2=car("Huyndai","mod1","2022","manual","white")
c3=car("Moto","mod1","2021","automatic","black")
c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()