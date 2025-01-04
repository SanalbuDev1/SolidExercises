package solid.examples.java.solid.java.badexercises.goodexercises;

/**
 * La clase InterfaceSegregation demuestra el principio de segregación de interfaces.
 * Está diseñada para gestionar diferentes tipos de empleados en una empresa.
 *
 * Existen diferentes tipos de empleados, como:
 * - Empleados de tiempo completo.
 * - Contratistas.
 * - Freelancers.
 *
 * El problema surge porque no todos los empleados tienen las mismas características o responsabilidades. Por ejemplo:
 * - Los empleados de tiempo completo tienen un salario mensual y pueden recibir beneficios.
 * - Los contratistas reciben un pago por hora.
 * - Los freelancers tienen un contrato por proyecto con un monto fijo.
 *
 * @autor santalbu
 */
public class InterfaceSegregation {

    /**
     * La interfaz BaseEmployee define el tipo de empleado.
     */
    interface BaseEmployee {
        /**
         * Obtiene el tipo de empleado.
         *
         * @return El tipo de empleado.
         */
        String getEmployeeType();
    }

    /**
     * La interfaz SalariedEmployee define el método para calcular el salario mensual.
     */
    interface SalariedEmployee extends BaseEmployee {
        /**
         * Calcula el salario mensual.
         *
         * @return El salario mensual.
         */
        double calculateMonthlySalary();
    }

    /**
     * La interfaz BenefitEligible define el método para calcular los beneficios.
     */
    interface BenefitEligible {
        /**
         * Calcula los beneficios.
         *
         * @param portion La porción del beneficio.
         * @return El monto del beneficio.
         */
        double calculateBenefit(double portion);
    }

    /**
     * La interfaz HourlyEmployee define el método para calcular la tasa por hora.
     */
    interface HourlyEmployee extends BaseEmployee {
        /**
         * Calcula la tasa por hora.
         *
         * @return La tasa por hora.
         */
        double calculateHourlyRate();
    }

    /**
     * La interfaz ProjectEmployee define el método para calcular el pago por proyecto.
     */
    interface ProjectEmployee extends BaseEmployee {
        /**
         * Calcula el pago por proyecto.
         *
         * @return El pago por proyecto.
         */
        double calculateProjectFee();
    }

    /**
     * La clase FullTimeEmployee implementa SalariedEmployee y BenefitEligible para representar un empleado de tiempo completo.
     */
    class FullTimeEmployee implements SalariedEmployee, BenefitEligible {
        private double monthlySalary;
        private double benefit;

        /**
         * Constructor de la clase FullTimeEmployee.
         *
         * @param monthlySalary El salario mensual.
         * @param benefit El beneficio.
         */
        public FullTimeEmployee(double monthlySalary, double benefit) {
            this.monthlySalary = monthlySalary;
            this.benefit = benefit;
        }

        @Override
        public double calculateMonthlySalary() {
            return monthlySalary;
        }

        @Override
        public double calculateBenefit(double portion) {
            return monthlySalary * portion;
        }

        @Override
        public String getEmployeeType() {
            return "Full-Time Employee";
        }
    }

    /**
     * La clase Contractor implementa HourlyEmployee para representar un contratista.
     */
    class Contractor implements HourlyEmployee {
        private double hourlyRate;

        /**
         * Constructor de la clase Contractor.
         *
         * @param hourlyRate La tasa por hora.
         */
        public Contractor(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateHourlyRate() {
            return hourlyRate;
        }

        @Override
        public String getEmployeeType() {
            return "Contractor";
        }
    }

    /**
     * La clase Freelancer implementa ProjectEmployee para representar un freelancer.
     */
    class Freelancer implements ProjectEmployee {
        private double projectFee;

        /**
         * Constructor de la clase Freelancer.
         *
         * @param projectFee El pago por proyecto.
         */
        public Freelancer(double projectFee) {
            this.projectFee = projectFee;
        }

        @Override
        public double calculateProjectFee() {
            return projectFee;
        }

        @Override
        public String getEmployeeType() {
            return "Freelancer";
        }
    }

    /**
     * La clase EmployeeProcessor procesa diferentes tipos de empleados.
     */
    class EmployeeProcessor {
        /**
         * Procesa un empleado.
         *
         * @param employee El empleado a procesar.
         */
        public void process(BaseEmployee employee) {
            System.out.println("Processing " + employee.getEmployeeType());
            if (employee instanceof SalariedEmployee && employee instanceof BenefitEligible) {
                SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
                BenefitEligible benefitEligible = (BenefitEligible) employee;

                System.out.println("Monthly Salary: $" + salariedEmployee.calculateMonthlySalary() +
                        " | Benefits: $" + benefitEligible.calculateBenefit(0.1));
            }
            if (employee instanceof BenefitEligible) {
                System.out.println("Benefit: " + ((BenefitEligible) employee).calculateBenefit(0.1));
            }
            if (employee instanceof HourlyEmployee) {
                System.out.println("Hourly Rate: " + ((HourlyEmployee) employee).calculateHourlyRate());
            }
            if (employee instanceof ProjectEmployee) {
                System.out.println("Project Fee: " + ((ProjectEmployee) employee).calculateProjectFee());
            }
            System.out.println("------------");
        }
    }



    /**
     * Método principal para ejecutar el ejemplo de segregación de interfaces.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        InterfaceSegregation interfaceSegregation = new InterfaceSegregation();

        BaseEmployee fullTime = interfaceSegregation.new FullTimeEmployee(3000.0, 500.0);
        BaseEmployee contractor = interfaceSegregation.new Contractor(20.0);
        BaseEmployee freelancer = interfaceSegregation.new Freelancer(5000.0);

        EmployeeProcessor processor = interfaceSegregation.new EmployeeProcessor();

        processor.process(fullTime);
        processor.process(contractor);
        processor.process(freelancer);

    }

}