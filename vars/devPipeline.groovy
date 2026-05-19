def call() {
    
    echo 'Running Dev Stage: Data Ingestion and Training...' [cite: 12, 13]
    sh '''
        cd ~/mlops_assignment
        source venv/bin/activate
        python train.py
    '''
    echo 'Model evaluation completed successfully. Assigned alias: Challenger.' [cite: 16, 20]
}
