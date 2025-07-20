# 📧 Smart Email AI Assistant

An intelligent AI-powered assistant that helps users write smarter emails using a custom-built Chrome Extension.  
Built with React (frontend), Spring Boot (backend), and powered by Gemini API.

---

## 🎯 Overview

The Smart Email AI Assistant helps users write professional, friendly, or casual emails quickly by:
- 🧠 Using Gemini API to generate AI-powered email content
- 🧩 Seamlessly integrating via a local Chrome Extension
- 🎛️ Allowing users to set the tone (Professional / Friendly / Casual)

---

## 🚀 Features

- ✍️ AI-generated email content using Gemini API
- 🌐 Chrome Extension that works directly in your browser
- ⚙️ Spring Boot backend handles authentication and request forwarding
- 🎨 React frontend interface for custom tone selection and editing
- 🔐 Local use (can be extended for cloud deployment)

---

## 🖥️ Tech Stack

<p align="left">
  <img src="https://img.shields.io/badge/Frontend-React-61DAFB?style=for-the-badge&logo=react&logoColor=white" />
  <img src="https://img.shields.io/badge/Backend-SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/AI-Gemini%20API-blueviolet?style=for-the-badge&logo=google&logoColor=white" />
  <img src="https://img.shields.io/badge/Extension-Chrome-yellow?style=for-the-badge&logo=googlechrome&logoColor=black" />
</p>

---

## 📁 Project Structure
  ```
Smart-Email-Assistant/
├── email-writer-sb/ ← Spring Boot backend
│ ├── src/
│ └── pom.xml
├── email-writer-react/ ← React frontend
│ ├── public/
│ ├── src/
│ └── package.json
├── email-writer-ext/ ← Chrome Extension folder
│ ├── manifest.json
│ ├── content.css
│ ├── content.js 
└── README.md
```

