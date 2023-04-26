import random


class EngineType:
    __listEngineType = "petrol", "gas", "diesel", "electric"
    engineType = random.choice(__listEngineType)


class EnginePower:
    __listEnginePower = 90, 100, 106, 124, 136, 150
    enginePower = random.choice(__listEnginePower)


class BodyType:
    __listBodyType = "sedan", "hatchback", "liftback", "wagon"
    bodyType = random.choice(__listBodyType)


class Engine(EngineType, EnginePower):

    def engine_info(self):
        print("Тип двигателя: " + self.engineType)
        print("Мощность: " + str(self.enginePower) + " л.с.")


class Car(BodyType, Engine):

    def car_info(self):
        print("\nТип кузова: " + self.bodyType)
        self.engine_info()


ob = Engine()
ob.engine_info()
ob = Car()
ob.car_info()
