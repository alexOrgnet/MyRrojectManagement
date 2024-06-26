package com.company.myprojectmanagement.view.project;

import com.company.myprojectmanagement.entity.Project;

import com.company.myprojectmanagement.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "projects", layout = MainView.class)
@ViewController("Project.list")
@ViewDescriptor("project-list-view.xml")
@LookupComponent("projectsDataGrid")
@DialogMode(width = "64em")
public class ProjectListView extends StandardListView<Project> {
}