package page.lospoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class FinancialDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "FINANCIALDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "FINANCIALDETAILS_ID_GENERATOR", sequenceName = "FINANCIALDETAILS_ID_SEQ")
   private java.lang.Long id;

   private java.lang.Long processInstanceID;

   private java.lang.String customerOccupation;

   private Integer month1Salary;

   private Integer month2Salary;

   private Integer month3Salary;

   private Integer monthlyAvgSalary;

   private Integer year2Income;

   private Integer year1Income;

   private Integer year3Income;

   private Integer avgAnnualIncome;

   private Integer otherIncome;

   private Integer existingMonthlyEMI;

   private Integer incomeCreditScore;

   public FinancialDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Long getProcessInstanceID()
   {
      return this.processInstanceID;
   }

   public void setProcessInstanceID(java.lang.Long processInstanceID)
   {
      this.processInstanceID = processInstanceID;
   }

   public java.lang.String getCustomerOccupation()
   {
      return this.customerOccupation;
   }

   public void setCustomerOccupation(java.lang.String customerOccupation)
   {
      this.customerOccupation = customerOccupation;
   }

   public java.lang.Integer getMonth1Salary()
   {
      return this.month1Salary;
   }

   public void setMonth1Salary(java.lang.Integer month1Salary)
   {
      this.month1Salary = month1Salary;
   }

   public java.lang.Integer getMonth2Salary()
   {
      return this.month2Salary;
   }

   public void setMonth2Salary(java.lang.Integer month2Salary)
   {
      this.month2Salary = month2Salary;
   }

   public java.lang.Integer getMonth3Salary()
   {
      return this.month3Salary;
   }

   public void setMonth3Salary(java.lang.Integer month3Salary)
   {
      this.month3Salary = month3Salary;
   }

   public java.lang.Integer getMonthlyAvgSalary()
   {
      return this.monthlyAvgSalary;
   }

   public void setMonthlyAvgSalary(java.lang.Integer monthlyAvgSalary)
   {
      this.monthlyAvgSalary = monthlyAvgSalary;
   }

   public java.lang.Integer getYear2Income()
   {
      return this.year2Income;
   }

   public void setYear2Income(java.lang.Integer year2Income)
   {
      this.year2Income = year2Income;
   }

   public java.lang.Integer getYear1Income()
   {
      return this.year1Income;
   }

   public void setYear1Income(java.lang.Integer year1Income)
   {
      this.year1Income = year1Income;
   }

   public java.lang.Integer getYear3Income()
   {
      return this.year3Income;
   }

   public void setYear3Income(java.lang.Integer year3Income)
   {
      this.year3Income = year3Income;
   }

   public java.lang.Integer getAvgAnnualIncome()
   {
      return this.avgAnnualIncome;
   }

   public void setAvgAnnualIncome(java.lang.Integer avgAnnualIncome)
   {
      this.avgAnnualIncome = avgAnnualIncome;
   }

   public java.lang.Integer getOtherIncome()
   {
      return this.otherIncome;
   }

   public void setOtherIncome(java.lang.Integer otherIncome)
   {
      this.otherIncome = otherIncome;
   }

   public java.lang.Integer getExistingMonthlyEMI()
   {
      return this.existingMonthlyEMI;
   }

   public void setExistingMonthlyEMI(java.lang.Integer existingMonthlyEMI)
   {
      this.existingMonthlyEMI = existingMonthlyEMI;
   }

   public java.lang.Integer getIncomeCreditScore()
   {
      return this.incomeCreditScore;
   }

   public void setIncomeCreditScore(java.lang.Integer incomeCreditScore)
   {
      this.incomeCreditScore = incomeCreditScore;
   }

   public FinancialDetails(java.lang.Long id, java.lang.Long processInstanceID,
         java.lang.String customerOccupation, java.lang.Integer month1Salary,
         java.lang.Integer month2Salary, java.lang.Integer month3Salary,
         java.lang.Integer monthlyAvgSalary, java.lang.Integer year2Income,
         java.lang.Integer year1Income, java.lang.Integer year3Income,
         java.lang.Integer avgAnnualIncome, java.lang.Integer otherIncome,
         java.lang.Integer existingMonthlyEMI,
         java.lang.Integer incomeCreditScore)
   {
      this.id = id;
      this.processInstanceID = processInstanceID;
      this.customerOccupation = customerOccupation;
      this.month1Salary = month1Salary;
      this.month2Salary = month2Salary;
      this.month3Salary = month3Salary;
      this.monthlyAvgSalary = monthlyAvgSalary;
      this.year2Income = year2Income;
      this.year1Income = year1Income;
      this.year3Income = year3Income;
      this.avgAnnualIncome = avgAnnualIncome;
      this.otherIncome = otherIncome;
      this.existingMonthlyEMI = existingMonthlyEMI;
      this.incomeCreditScore = incomeCreditScore;
   }

}