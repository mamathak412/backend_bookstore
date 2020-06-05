package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookstore.model.Book;

@Component
public class DataCenter {
	
	public List<Book> getDevopsBooks() {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("B1", "Accelerate, The Science of Lean Software and DevOps: Building and Scaling High Performing Technology Organizations\r\n" + 
				"by Nicole Forsgren, Je", "All the data from the state of DevOps reports compiled into a book", 
				"245 ratings", "https://sites.google.com/site/uyew87e3728r672fyuer/ebook-accelerate-the-science-of-lean-software-and-devops-building-and-scaling-high-performing-technology-organizations-full-pages-all-format-support-by-nicole-forsgren",
				"./assets/images/accelerate.jpg", "579.68",
				"Nicole Forsgren, Jez Humble, Gene Kim"));
		
		books.add(new Book("B2", "Ansible: Up and Running, Automating Configuration Management and Deployment the Easy Way",
				" Ansible is one of the best choices and it is adopted by a large community of DevOps developers and system administrators. In this book, you will learn several things about Ansible, understand how Ansible differs from other configuration management systems,"
				+ " use the YAML file format to write your own playbooks", 
				"",
				"https://www.academia.edu/39028507/Lorin_Hochstein_and_Ren%C3%A9_Moser_Ansible_Up_and_Running_AUTOMATING_CONFIGURATION_MANAGEMENT_AND_DEPLOYMENT_THE_EASY_WAY", 
				"./assets/images/ansible.jpg", "1,490",
				"Lorin Hochstein, Rene Moser"));
		
		books.add(new Book("B3", "Continuous Delivery: Reliable Software Releases through Build, Test, and Deployment Automation",
				"This book is a guide to release software faster while reducing risk and increasing quality. It enumerates the best practices and fast, simple techniques for release and production deployment management. It also includes many other practices like production monitoring and tracing, dependency management, and the effective use of virtualization.\r\n" + 
				"\r\n" + 
				"The books will teach you the foundation of continuous delivery, "
				+ "the techniques to create a good deployment pipeline, and a vision about the delivery ecosystem.", 
				"", "", "./assets/images/ContinousDelivery.jpg", "558.60",
				"Jez Humble and David Farley"));
		
		books.add(new Book("B4", "DevOps: A Software Architect’s Perspective", 
				"For software architects, this book is a very good reference to understand and master"
				+ " DevOps environments. It was written by three software architects and it covers a "
				+ "lot of interesting subjects like DevOps requirements, virtualization and cloud computing, operations, adapting systems to work well with DevOps practices, agile methods, and test-driven development. You will find this book helpful if you are interested in handling failure detection, upgrade planning, integrating security controls, roles and audits into DevOps, preparing a business plan for DevOps adoption, rollout, and measurement and adapting softwares to your DevOps pipeline and workflows.\r\n" + 
				"\r\n" + 
				"", 
				"22 ratings", 
				"", 
				"./assets/images/devops.jpg", "558",
				"Nicole Forsgren, Jez Humble, Gene Kim"));
		
		books.add(new Book("B5", "Effective DevOps: Building a Culture of Collaboration, Affinity, and Tooling at Scale", 
				"Effective DevOps is not just a technical guide but it is also a cultural and"
				+ " managerial guide. DevOps is about team collaboration and cultural challenges and this book focus more on these human sides. This book connects the technical and cultural aspects of DevOps in a fantastic way by "
				+ "describing failures and successes.", 
				"", "", "./assets/images/effectivedevops.jpg", "1315",
				"Jennifer Davis, Ryn Daniels"));
		
		books.add(new Book("B6", "Just Culture: Balancing Safety and Accountability", 
				"This covers blamelessness in our human systems and how to build more effective teams "
				+ "by creating understanding and empathy.\r\n" + 
				"\r\n" + 
				"", 
				"", "", "./assets/images/justculture.jpg", "2375",
				"Sidney Dekker"));
		
		books.add(new Book("B7", "Measure What Matters", 
				"Measure What Matters is a book by John Doerr about a scalable methodology for "
				+ "leaders to set measurable goals and establish full organizational alignment. ", 
				"", "", "./assets/images/MeasureWhatHappens.jpg", "580",
				"John Doerr"));
		
		return books;
	}

	public List<Book> getJenkinsBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("JB1"
				, "Mastering Jenkins",
				"Implement sophisticated and scalable continuous delivery environment for effective software development.\r\n" + 
				"Key Features\r\n" + 
				"Learn about all the tools inside Jenkins that can help write complex pipelines\r\n" + 
				"Integrate Jenkins with some of the most popular DevOps tools for CI/CD\r\n" + 
				"A detailed guide about Jenkins Administration", 
				"4.13 ratings", 
				"http://rodulepiguzu.comunidades.net/mastering-jenkins-pdf-download",
				"./assets/images/MasteringJenkins.jpg", "", "Nikhil Pathania"));
		
		
		books.add(new Book("JB2", 
				"Continuous Delivery with Docker and Jenkins"
				, "Develop a complete continuous delivery process using modern DevOps tools such "
						+ "as Docker, Jenkins, Ansible, and GitHubKey FeaturesBuild reliable and"
						+ " secure applications using Docker containersCreate a highly available "
						+ "environment to scale Docker servers using KubernetesImplement an advanced "
						+ "continuous delivery process by parallelizing pipeline tasksBook"
						+ " DescriptionCombining Jenkins and Docker drastically helps you improve the "
						+ "continuous integration and delivery process of your app development, and "
						+ "this up-to-date second edition of Continuous Delivery with Docker and "
						+ "Jenkins will effectively guide you through it.",
				"2 ratings", 
				"https://ttriet.files.wordpress.com/2018/02/continuous-delivery-with-docker-and-jenkins.pdf",
				"./assets/images/DockerJenkins.jpg", "$5.84",
				"Rafal Leszko")); 
		
		books.add(new Book("JB3", 
				"Jenkins Fundamentals",
				"Continuous integration with Jenkins speeds up your projects and saves you time and money\r\n" + 
				"Key Features\r\n" + 
				"Get a perfect balance of theories and hands-on activities\r\n" + 
				"Apply continuous integration and delivery to your workflow\r\n" + 
				"Explore concepts such as the plugin ecosystem and adaptive build parameters, among others", 
				"4.13 ratings", 
				"http://susanna.badgley.place.antifragile.co/written-by-joseph-muli-arnold-okoth-jenkins-fundamentals-accelerate-deliverables-manage-builds-and-automate-pipelines-with-jenkins.pdf",
				"./assets/images/JenkinsFundamentals.jpg",
				" $22.61",
				"Joseph Muli, Arnold Okoth"));
		
		books.add(new Book("JB4",
				"Jenkins: The Definitive Guide: Continuous Integration for the Masses", 
				"Streamline software development with Jenkins, the popular Java-based open source tool that has revolutionized the way teams think about Continuous Integration (CI). This complete guide shows you how to automate your build, integration, release, and deployment processes with Jenkins—and demonstrates how CI can save you time, money, and many headaches.\r\n" + 
				"\r\n" + 
				"Ideal for developers, software architects, and project managers, Jenkins: The Definitive Guide is both a CI tutorial and a comprehensive Jenkins reference. Through its wealth of best practices and real-world tips, you'll discover how easy it is to set up a CI service with Jenkins.", 
				"32 rating", 
				"",
				"./assets/images/JenkinsDefGuide.jpg", 
				"$9.31",
				"John Ferguson Smart"));
		
		return books;
	}
	
	public List<Book> getAWSBooks() {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("AB1", 
				"Amazon Web Services Bootcamp",
				"“AWS is at the forefront of Cloud Computing today. Businesses are adopting AWS because of its reliability, versatility, and flexible design. The main focus of this book is teaching you how to build and manage highly reliable and scalable applications and services on AWS. It will provide you with all the necessary skills to design, deploy, and manage your applications and services on the AWS cloud platform. […] By the end of the book, you’ll be able to create a highly secure, fault tolerant, and scalable environment for your applications to run on.”",
				"3 ratings",
				"", 
				"./assets/images/AwsBootcamp.jpg",
				"$65.85", "Sunil Gulabani "));
		
		books.add(new Book("AB2",
				"Amazon Web Services in Action",
				"“Amazon Web Services in Action, Second Edition is a comprehensive introduction to computing, storing, and networking in the AWS cloud. You’ll find clear, relevant coverage of all the essential AWS services you to know, emphasizing best practices for security, high availability and scalability. The largest and most mature of the cloud platforms, AWS offers over 100 prebuilt services, practically limitless compute resources, bottomless secure storage, as well as top-notch automation capabilities.” ",
				"69 ratings",
				"",
				"./assets/images/AwsAction.jpg",
				" $21.99", 
				"by Andreas Wittig and Michael Wittig"));
		
		books.add(new Book("AB3",
				"AWS: AMAZON WEB SERVICES: The Complete Guide From Beginners For Amazon Web Services", 
				"Amazon Web Services is known to be a subsidiary under Amazon which has so far provided individuals, companies or even governments with platforms for on-demand cloud computing on a metered pay as you go basis. In total, these services about cloud computing provide some sort of primitive technical infrastructure that are technical and also distributed computing building blocks as well as tools. \r\n" + 
				"\r\n" + 
				"Now, if you have really chosen to learn about Amazon Web Services, you're definitely going to be needing this particular book. \r\n" + 
				"\r\n" + 
				"I have taken time to explicitly open the grey areas of AWS in this book, ranging from cloud computing, understanding the business philosophy behind Amazon, the Amazon Web Services Management Console, Services of the platform, application integration, among others. \r\n" + 
				"\r\n" + 
				"These are the benefits you stand to gain by reading through this book. This book has everything you need to know about Amazon Web Services for you to advance from beginners to advanced level for AWS. ", 
				" $13.75", 
				"", 
				"./assets/images/AwsWeb.jpg",
				"",
				"Richard Derry"));
		
		return books;
				
	}

}
