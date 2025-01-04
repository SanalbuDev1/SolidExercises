package solid.examples.java.solid.java.badexercises.badexercises;

public class InterfaceSegregation {

    interface Employee {
        double calculateMonthlySalary();
        double calculateHourlyRate();
        double calculateProjectFee();
    }

    class FullTimeEmployee implements Employee {
        @Override
        public double calculateMonthlySalary() {
            return 3000.0; // Salario mensual fijo
        }

        @Override
        public double calculateHourlyRate() {
            throw new UnsupportedOperationException("Full-time employees don't have an hourly rate.");
        }

        @Override
        public double calculateProjectFee() {
            throw new UnsupportedOperationException("Full-time employees don't work on project fees.");
        }
    }

    class Contractor implements Employee {
        @Override
        public double calculateMonthlySalary() {
            throw new UnsupportedOperationException("Contractors don't have a monthly salary.");
        }

        @Override
        public double calculateHourlyRate() {
            return 20.0; // Tasa por hora
        }

        @Override
        public double calculateProjectFee() {
            throw new UnsupportedOperationException("Contractors don't work on project fees.");
        }
    }

    class Freelancer implements Employee {
        @Override
        public double calculateMonthlySalary() {
            throw new UnsupportedOperationException("Freelancers don't have a monthly salary.");
        }

        @Override
        public double calculateHourlyRate() {
            throw new UnsupportedOperationException("Freelancers don't have an hourly rate.");
        }

        @Override
        public double calculateProjectFee() {
            return 5000.0; // Pago por proyecto
        }
    }

}
