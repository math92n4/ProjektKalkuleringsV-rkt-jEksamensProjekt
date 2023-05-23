package com.example.projektkalkuleringsprojekt2semexam.service;

import com.example.projektkalkuleringsprojekt2semexam.model.Project;
import com.example.projektkalkuleringsprojekt2semexam.model.Subproject;
import com.example.projektkalkuleringsprojekt2semexam.repository.ProjectRepository;
import com.example.projektkalkuleringsprojekt2semexam.model.Task;
import com.example.projektkalkuleringsprojekt2semexam.model.User;
import com.example.projektkalkuleringsprojekt2semexam.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // Project

    public void createProject(Project project, int userid) {
        projectRepository.createProject(project, userid);


    public void createProject(Project project, List<Integer> listOfUsers) {
        mainRepository.createProject(project, listOfUsers);
    }

    public List<Project> getProject() {
        return projectRepository.getProjects();
    }

    // method doesn't work just yet, still shows 0 total hours;
    public int getTotalEstimatedTimeForProject(int subprojectID1, int subprojectID2) {
        return mainRepository.estimatedTimeForProject(subprojectID1, subprojectID2);
    }

    public List<Project> getProjectsByUserId(int id) {
        return projectRepository.getProjectsByUserId(id);
    }

    public Project findProjectByID(int id) {
        return projectRepository.findProjectByID(id);
    }

    public void editProject(int id, Project editedProject) {
        projectRepository.editProject(id, editedProject);
    }

    public void deleteProject(int id) {
        projectRepository.deleteProject(id);
    }


    //SUBPROJECTS

    public void createSubproject(List<Integer> listOfUsers, int projectid, Subproject subproject) {
        mainRepository.createSubproject(listOfUsers,projectid,subproject);
    }

    public List<Subproject> getSubprojectByProjectId(int projectid) {
        return projectRepository.getSubprojectByProjectId(projectid);
    }

    public Subproject getSubprojectById(int id) {
        return projectRepository.getSubprojectById(id);
    }

    public void editSubproject(int id, Subproject editedSubproject) {
        projectRepository.editSubproject(id, editedSubproject);
    }

    public void deleteSubproject(int id) {
        projectRepository.deleteSubproject(id);
    }

    //TASKS

    public void createTask(List<Integer> listOfUsers, int subprojectid, Task task) {
        mainRepository.createTask(listOfUsers,subprojectid,task);
    }



}
