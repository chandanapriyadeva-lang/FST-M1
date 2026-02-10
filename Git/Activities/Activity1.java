First-Time Setup (One Time Only)
git config --global user.name "Your Name"
git config --global user.email "your@email.com"


Check config:

git config --list

📥 CLONE a Repository (Download project from Git)
git clone https://github.com/username/repository-name.git


Then go into the project folder:

cd repository-name

📤 PUSH = Send Your Code to GitHub
1️⃣ Check changed files
git status

2️⃣ Add files to staging

Add one file:

git add filename.java


Add all files:

git add .

3️⃣ Commit (save snapshot)
git commit -m "Added login test automation"

4️⃣ Push to remote repository
git push origin main


👉 If your branch is master:

git push origin master

📥 PULL = Get Latest Code from GitHub
git pull origin main


This updates your local project with teammates’ changes.

🌿 Working with Branches (Very Important in Teams)
Create a new branch
git checkout -b feature/login-test

Switch branch
git checkout main

Push new branch to GitHub
git push origin feature/login-test

Get latest main into your branch
git pull origin main

🔄 Daily Workflow (Real Project Flow)
git pull origin main        # Get latest code
git checkout -b feature/xyz # Create branch
# Make code changes
git add .
git commit -m "Implemented xyz feature"
git push origin feature/xyz


Then create Pull Request (PR) in GitHub.

❗ Handling Merge Conflicts

If Git says conflict:

Open the file

Look for:

<<<<<<< HEAD
Your code
=======
Other person's code
>>>>>>> branch-name


Fix manually

Then:

git add .
git commit -m "Resolved merge conflict"
git push
