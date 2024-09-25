import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    private int id;
    private String name;
    private int age;
    private String illness;

    public Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Illness: " + illness;
    }
}


class Doctor {
    private int id;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
    }
}

class Appointment {
    private int appointmentId;
    private Doctor doctor;
    private Patient patient;

    public Appointment(int appointmentId, Doctor doctor, Patient patient) {
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.patient = patient;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + ", Doctor: " + doctor.getName() + ", Patient: " + patient.getName();
    }
}

class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public void listDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void listPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void listAppointments() {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Create Appointment");
            System.out.println("4. List Doctors");
            System.out.println("5. List Patients");
            System.out.println("6. List Appointments");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor ID: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Doctor Specialization: ");
                    String specialization = scanner.nextLine();
                    Doctor doctor = new Doctor(doctorId, doctorName, specialization);
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Patient Illness: ");
                    String illness = scanner.nextLine();
                    Patient patient = new Patient(patientId, patientName, age, illness);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Appointment ID: ");
                    int appointmentId = scanner.nextInt();
                    System.out.print("Enter Doctor ID: ");
                    int aDoctorId = scanner.nextInt();
                    System.out.print("Enter Patient ID: ");
                    int aPatientId = scanner.nextInt();
                    Doctor aDoctor = hospital.findDoctorById(aDoctorId);
                    Patient aPatient = hospital.findPatientById(aPatientId);
                    if (aDoctor != null && aPatient != null) {
                        Appointment appointment = new Appointment(appointmentId, aDoctor, aPatient);
                        hospital.addAppointment(appointment);
                        System.out.println("Appointment created successfully.");
                    } else {
                        System.out.println("Doctor or Patient not found.");
                    }
                    break;
                case 4:
                    hospital.listDoctors();
                    break;
                case 5:
                    hospital.listPatients();
                    break;
                case 6:
                    hospital.listAppointments();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
