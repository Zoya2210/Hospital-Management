package pack;
import java.io.*;
import java.util.*;

//Hospital
public class Hospital {

Vector doctorList = new Vector();
Vector patientList = new Vector();
String hospitalName;
void addDoctor(Doctor o)
{
    doctorList.add(o);

}
void addPatient(Patient o)
{
    PatientList.add(o);
}
Hospital(String name)
{
    this.hospitalName=name;
}

public List<Doctor> showDoctors()
{
    return doctorList;
}
public List<Patient> showPatients()
{
    return patientList;
}

public void assignDoctor()
{
    for (Patient x: PatientList)
    {      for (Doctor y: doctorList)
            {     if (x.getDisease().equals("eye"))
                        {
                            if (y.getDoctorspeciality().equals("Opthalmologist"))
                                {
                                   y.addPatientsToDoctor(x);
                                }
                        }
            if (x.getDisease().equals("heart patient"))
            {
                if (y.getDoctorspeciality().equals("Surgeon"))
                    {
                       y.addPatientsToDoctor(x);
                    }
            }

            if (x.getDisease().equals("earnose"))
            {
                if (y.getDoctorspeciality().equals("ENT"))
                    {
                       y.addPatientsToDoctor(x);
                    }
            }

            }
        }

}


}

