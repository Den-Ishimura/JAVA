package JAVA;

import java.util.Scanner;

public class JAVA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome to Health Chatbot, " + name + "!");

        int attempts1 = 3;
        String user1 = "14356";
        String user2 = "143";

        while (attempts1 > 0) {
            System.out.println("Please Enter the password: ");
            String pass = scanner.nextLine();

            if (pass.equals(user1) || pass.equals(user2)) {
                System.out.println("Password is correct. Welcome to Health ChatBOT!");
                break;
            } else {
                attempts1--;
                System.out.println("Incorrect password. Attempts left: " + attempts1);

                if (attempts1 == 0) {
                    System.out.println("Too many incorrect attempts. Exiting program.");
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println("Please Wait A Minute...");
        int countdownTime = 5;

        while (countdownTime > 0) {
            System.out.println(countdownTime);
            countdownTime--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("An error occurred in the countdown.");
            }
        }

        System.out.println("You're Ready:)");

        // Main menu loop
        while (true) {
            System.out.println("*******************************");
            System.out.println("Our Healthcare has support in the list below:");

            System.out.println("1.) Health Care Medication Appointment");
            System.out.println("2.) Disease Dictionary and other Terms");
            System.out.println("3.) Health Monitor Body Check");
            System.out.println("4.) Exit");

            System.out.println("Please type the number you want to proceed with or type '0' to go back to the main menu: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Returning to the main menu...");
                continue;
            }

            switch (choice) {
                case 1:
                    // Nested switch for Health Care Medication Appointment
                    while (true) {
                    	 System.out.println("If you want to having appointment please check our list below and go directly to our hospital to make an appointment ");
                        System.out.println("You selected Health Care Medication Appointment.");
                        System.out.println("Please choose a type of doctor:");
                        System.out.println("1.) Neurologist");
                        System.out.println("2.) Family Medicine");
                        System.out.println("3.) Psychiatrist");
                        System.out.println("4.) Go back");

                        int doctorTypeChoice = scanner.nextInt();

                        if (doctorTypeChoice == 4) {
                            System.out.println("Returning to the main menu.");
                            break;  // Exit this case and go back to the main menu
                        }

                        String doctorList = "";
                        if (doctorTypeChoice == 1) {
                            doctorList = "Dr. Smith - Monday, Tuesday, Friday - 9:00 AM - 12:00 PM\n" +
                                         "Dr. Johnson - Monday, Tuesday, Friday - 1:00 PM - 4:00 PM\n" +
                                         "Dr. Brown - Monday, Tuesday, Friday - 10:00 AM - 2:00 PM\n" +
                                         "Dr. Lee - Monday, Tuesday, Friday - 11:00 AM - 3:00 PM";
                        } else if (doctorTypeChoice == 2) {
                            doctorList = "Dr. Adams - Monday, Wednesday, Friday - 8:00 AM - 11:00 AM\n" +
                                         "Dr. Clark - Monday, Wednesday, Friday - 2:00 PM - 5:00 PM\n" +
                                         "Dr. Miller - Tuesday, Thursday - 9:00 AM - 1:00 PM\n" +
                                         "Dr. Wilson - Tuesday, Thursday - 11:00 AM - 3:00 PM";
                        } else if (doctorTypeChoice == 3) {
                            doctorList = "Dr. White - Monday, Tuesday, Thursday - 10:00 AM - 1:00 PM\n" +
                                         "Dr. Harris - Monday, Wednesday, Friday - 2:00 PM - 5:00 PM\n" +
                                         "Dr. Nelson - Tuesday, Thursday - 1:00 PM - 4:00 PM\n" +
                                         "Dr. Taylor - Wednesday, Friday - 9:00 AM - 12:00 PM";
                        } else {
                            System.out.println("Invalid choice. Please select again.");
                            continue;
                        }

                        // Display the doctor list for the selected type
                        System.out.println("Available Doctors:\n" + doctorList);

                        System.out.println("\nWould you like to choose another doctor? (1 to continue, 0 to go back): ");
                        int backChoice = scanner.nextInt();
                        if (backChoice == 0) {
                            break;  // Go back to the main menu if user selects 0
                        }
                    }
                    break;

                case 2:
                    System.out.println("Disease Dictionary and other Terms");
                    while (true) {
                        System.out.println("Choose a disease to learn more about:");
                        System.out.println("1.) Diabetes Mellitus");
                        System.out.println("2.) Hypertension (High Blood Pressure)");
                        System.out.println("3.) Tuberculosis (TB)");
                        System.out.println("4.) Asthma");
                        System.out.println("5.) Malaria");
                        System.out.println("6.) Cancer");
                        System.out.println("7.) Influenza (Flu)");
                        System.out.println("8.) Dengue Fever");
                        System.out.println("9.) Arthritis");
                        System.out.println("10.) Hepatitis");
                        System.out.println("11.) Alzheimer's Disease");
                        System.out.println("12.) Stroke");
                        System.out.println("13.) Pneumonia");
                        System.out.println("14.) Anemia");
                        System.out.println("15.) COVID-19");
                        System.out.println("16.) Cholera");
                        System.out.println("17.) Polio");
                        System.out.println("18.) Rabies");
                        System.out.println("19.) Chickenpox");
                        System.out.println("20.) Measles");
                        System.out.println("21.) Hepatitis B");
                        System.out.println("22.) Hepatitis C");
                        System.out.println("23.) HIV/AIDS");
                        System.out.println("24.) Epilepsy");
                        System.out.println("25.) Parkinson’s Disease");
                        System.out.println("26.) Lupus");
                        System.out.println("27.) Celiac Disease");
                        System.out.println("28.) Gout");
                        System.out.println("29.) Lyme Disease");
                        System.out.println("30.) Sickle Cell Disease");
                        System.out.println("31.) Chronic Obstructive Pulmonary Disease (COPD)");
                        System.out.println("32.) Obesity");
                        System.out.println("33.) Autism Spectrum Disorder (ASD)");
                        System.out.println("34.) Schizophrenia");
                        System.out.println("35.) Go back");
                        System.out.println("Please choose what you want to check:");

                        int diseaseChoice = scanner.nextInt();

                        if (diseaseChoice == 35) {
                            System.out.println("Returning to the main menu.");
                            break; // Go back to the main menu
                        }

                        switch (diseaseChoice) {
                            case 1:
                                System.out.println("**Diabetes Mellitus**");
                                System.out.println("A chronic condition where the body is unable to properly regulate blood sugar levels.");
                                break;
                            case 2:
                                System.out.println("**Hypertension (High Blood Pressure)**");
                                System.out.println("A condition where the force of the blood against the walls of the arteries is consistently too high.");
                                break;
                            case 3:
                                System.out.println("**Tuberculosis (TB)**");
                                System.out.println("A bacterial infection primarily affecting the lungs.");
                                break;
                            case 4:
                                System.out.println("**Asthma**");
                                System.out.println("A chronic condition causing inflammation and narrowing of the airways.");
                                break;
                            case 5:
                                System.out.println("**Malaria**");
                                System.out.println("A life-threatening disease caused by parasites transmitted through mosquito bites.");
                                break;
                            case 6:
                                System.out.println("**Cancer**");
                                System.out.println("A group of diseases characterized by uncontrolled cell growth.");
                                break;
                            case 7:
                                System.out.println("**Influenza (Flu)**");
                                System.out.println("A contagious viral infection attacking the respiratory system.");
                                break;
                            case 8:
                                System.out.println("**Dengue Fever**");
                                System.out.println("A mosquito-borne viral infection causing high fever and severe headache.");
                                break;
                            case 9:
                                System.out.println("**Arthritis**");
                                System.out.println("A condition causing inflammation and pain in the joints.");
                                break;
                            case 10:
                                System.out.println("**Hepatitis**");
                                System.out.println("Inflammation of the liver caused by infections or other factors.");
                                break;
                            case 11:
                                System.out.println("**Alzheimer's Disease**");
                                System.out.println("A progressive disease that destroys memory and other mental functions.");
                                break;
                            case 12:
                                System.out.println("**Stroke**");
                                System.out.println("Occurs when blood flow to a part of the brain is cut off.");
                                break;
                            case 13:
                                System.out.println("**Pneumonia**");
                                System.out.println("An infection that inflames the air sacs in one or both lungs.");
                                break;
                            case 14:
                                System.out.println("**Anemia**");
                                System.out.println("A condition where the body lacks enough healthy red blood cells.");
                                break;
                            case 15:
                                System.out.println("**COVID-19**");
                                System.out.println("A viral infection caused by SARS-CoV-2, affecting the respiratory system.");
                                break;
                            case 16:
                                System.out.println("**Cholera**");
                                System.out.println("An infection causing severe diarrhea and dehydration.");
                                break;
                            case 17:
                                System.out.println("**Polio**");
                                System.out.println("A viral disease that can cause paralysis.");
                                break;
                            case 18:
                                System.out.println("**Rabies**");
                                System.out.println("A deadly virus spread to people from the saliva of infected animals.");
                                break;
                            case 19:
                                System.out.println("**Chickenpox**");
                                System.out.println("A highly contagious viral infection causing an itchy rash.");
                                break;
                            case 20:
                                System.out.println("**Measles**");
                                System.out.println("A highly contagious viral disease causing fever and a red rash.");
                                break;
                            case 21:
                                System.out.println("**Hepatitis B**");
                                System.out.println("A serious liver infection caused by the hepatitis B virus.");
                                break;
                            case 22:
                                System.out.println("**Hepatitis C**");
                                System.out.println("A viral infection that causes liver inflammation.");
                                break;
                            case 23:
                                System.out.println("**HIV/AIDS**");
                                System.out.println("A condition caused by the human immunodeficiency virus that weakens the immune system.");
                                break;
                            case 24:
                                System.out.println("**Epilepsy**");
                                System.out.println("A disorder causing recurrent seizures.");
                                break;
                            case 25:
                                System.out.println("**Parkinson’s Disease**");
                                System.out.println("A nervous system disorder affecting movement.");
                                break;
                            case 26:
                                System.out.println("**Lupus**");
                                System.out.println("An autoimmune disease causing inflammation throughout the body.");
                                break;
                            case 27:
                                System.out.println("**Celiac Disease**");
                                System.out.println("An immune reaction to eating gluten.");
                                break;
                            case 28:
                                System.out.println("**Gout**");
                                System.out.println("A type of arthritis caused by uric acid buildup.");
                                break;
                            case 29:
                                System.out.println("**Lyme Disease**");
                                System.out.println("A bacterial infection spread by tick bites.");
                                break;
                            case 30:
                                System.out.println("**Sickle Cell Disease**");
                                System.out.println("A group of inherited red blood cell disorders.");
                                break;
                            case 31:
                                System.out.println("**Chronic Obstructive Pulmonary Disease (COPD)**");
                                System.out.println("A group of lung diseases causing airflow blockage.");
                                break;
                            case 32:
                                System.out.println("**Obesity**");
                                System.out.println("A condition characterized by excessive body fat.");
                                break;
                            case 33:
                                System.out.println("**Autism Spectrum Disorder (ASD)**");
                                System.out.println("A developmental disorder affecting communication and behavior.");
                                break;
                            case 34:
                                System.out.println("**Schizophrenia**");
                                System.out.println("A severe mental disorder affecting how a person thinks, feels, and behaves.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please select a number from the list.");
                        }

                        System.out.println("\nWould you like to learn about another disease? (1 to continue, 0 to go back): ");
                        int continueChoice = scanner.nextInt();
                        if (continueChoice == 0) {
                            break; // Go back to the main Disease Dictionary menu
                        }
                    }
                    break;


                case 3:
                    System.out.println("You selected Health Monitor Body Check.");
                    while (true) {
                        System.out.println("Please choose what you want to check:");
                        System.out.println("1.) BMI Test");
                        System.out.println("2.) Blood Pressure");
                        System.out.println("3.) n/a");
                        System.out.println("4.) Go back");

                        int healthChoice = scanner.nextInt();

                        if (healthChoice == 4) {
                            System.out.println("Returning to the main menu.");
                            break;  // Exit this case and go back to the main menu
                        }

                        if (healthChoice == 1) {
                            // BMI calculation section
                            System.out.print("Enter your weight (in kilograms): ");
                            double weight = scanner.nextDouble();

                            System.out.print("Enter your height (in meters): ");
                            double height = scanner.nextDouble();

                            double bmi = weight / (height * height);  // Calculate BMI
                            System.out.println("Your BMI is: " + bmi);

                            if (bmi < 18.5) {
                                System.out.println("You are underweight.");
                            } else if (bmi < 24.9) {
                                System.out.println("You have a normal weight.");
                            } else if (bmi < 29.9) {
                                System.out.println("You are overweight.");
                            } else {
                                System.out.println("You are obese.");
                            }
                        } else if (healthChoice == 2) {
                            // Blood pressure check section
                            while (true) {
                                System.out.println("Blood Pressure Check is selected.");
                                System.out.print("Systolic (top number): ");
                                int systolic = scanner.nextInt();

                                System.out.print("Diastolic (bottom number): ");
                                int diastolic = scanner.nextInt();

                                // Determine blood pressure category
                                if (systolic < 120 && diastolic < 80) {
                                    System.out.println("Your blood pressure is Normal.");
                                } else if (systolic < 130 && diastolic < 80) {
                                    System.out.println("Your blood pressure is Elevated.");
                                } else if ((systolic <= 139) || (diastolic <= 89)) {
                                    System.out.println("You have High Blood Pressure (Hypertension Stage 1).");
                                } else if (systolic >= 140 || diastolic >= 90) {
                                    System.out.println("You have High Blood Pressure (Hypertension Stage 2).");
                                } else if (systolic > 180 || diastolic > 120) {
                                    System.out.println("Hypertensive Crisis! Seek immediate medical attention.");
                                } else {
                                    System.out.println("Invalid readings entered. Please try again.");
                                }

                                // Ask user if they want to continue or go back
                                System.out.println("\nWould you like to check another reading? (1 to continue, 0 to go back): ");
                                int continueChoice = scanner.nextInt();

                                if (continueChoice == 0) {
                                    System.out.println("Returning to the Health Monitor Body Check menu.");
                                    break; // Exit the loop and return to the Health Monitor Body Check menu
                                } else if (continueChoice != 1) {
                                    System.out.println("Invalid input. Returning to the menu.");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Invalid choice. Please select again.");
                        }
                    }
                    break; // Correctly close the case block



                case 4:
                    System.out.println("Exiting the program. Thank you for using Health Chatbot!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please restart the program.");
                    break;
            }

            System.out.println("Would you like to choose another option? (1 to continue, 0 to exit): ");
            int continueChoice = scanner.nextInt();
            if (continueChoice == 0) {
                System.out.println("Exiting program.");
                break;
            } else if (continueChoice != 1) {
                System.out.println("Invalid input. Exiting program.");
                break;
            }
        }

        scanner.close();
    }
}
